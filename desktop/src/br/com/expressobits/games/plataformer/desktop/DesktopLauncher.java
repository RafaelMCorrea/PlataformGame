package br.com.expressobits.games.plataformer.desktop;

import br.com.expressobits.games.plataformer.Plataformer;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(1280,720);
		config.setResizable(false);
		config.useVsync(true);
		new Lwjgl3Application(Plataformer.getInstance(), config);
	}
}
