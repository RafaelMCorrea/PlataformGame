package br.com.expressobits.games.plataformer;

import br.com.expressobits.games.plataformer.resource.Assets;
import br.com.expressobits.games.plataformer.screen.GameScreen;
import br.com.expressobits.games.plataformer.screen.PreloadScreen;
import br.com.expressobits.games.plataformer.world.World;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Plataformer extends Game {

	private static Plataformer instance;

	public static final String NAME = "Plataform Game";

	public static final boolean DEBUG = true;

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	FPSLogger fpsLogger = new FPSLogger(NAME,true,false);

	private Plataformer(){}

	@Override
	public void create() {
		this.setScreen(new PreloadScreen());
	}

	public static Plataformer getInstance() {
		if(instance == null){
			instance = new Plataformer();
		}
		return instance;
	}

	@Override
	public void render() {
		super.render();
		if(DEBUG){
			fpsLogger.log();

			if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
				if(Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT)){
					//Este método re-chama todos métodos e instâncias da tela exibida
					getInstance().getScreen().show();
				}
			}
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		Assets.manager.dispose();
	}
}
