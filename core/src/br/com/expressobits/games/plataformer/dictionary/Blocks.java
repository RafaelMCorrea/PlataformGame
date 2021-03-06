package br.com.expressobits.games.plataformer.dictionary;

import br.com.expressobits.games.plataformer.block.Block;
import br.com.expressobits.games.plataformer.block.BlockAir;
import br.com.expressobits.games.plataformer.resource.Assets;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.IntMap;

public class Blocks {

    public static final IntMap<Block> REGISTRY = new IntMap<Block>();

    public static final int AIR_ID = 0;

    public static final Block AIR;

    public static final Block DIRT;

    public static final Block COBBLESTONE;

    public static final Block OBSIDIAN;

    public static final Block GRASS;

    public static Block getBlockById(int id){
        return REGISTRY.get(id);
    }

    public static int getIdByBlock(Block block){
        return REGISTRY.findKey(block,true,AIR_ID);
    }

    //USE DESIGN PATTERN PESO PENA (fly weight)
    private static Block register(int id, Block block){
        REGISTRY.put(id, block);
        return block;
    }

    static {
        AIR = register(AIR_ID,new BlockAir());
        DIRT = register(1,new Block(Assets.manager.get(Assets.dirt)));
        COBBLESTONE = register(2,new Block(Assets.manager.get(Assets.cobblestone)));
        OBSIDIAN = register(3,new Block(Assets.manager.get(Assets.obsidian)));
        GRASS = register(4,new Block(Assets.manager.get(Assets.grass)));
    }

}
