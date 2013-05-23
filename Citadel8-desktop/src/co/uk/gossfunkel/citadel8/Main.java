package co.uk.gossfunkel.citadel8;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	
	private static int width = 500;
	private static int height = width * 16/9;
	
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Citadel8";
		cfg.useGL20 = false;
		cfg.width = width;
		cfg.height = height;
		
		new LwjglApplication(new Game(), cfg);
	}
}
