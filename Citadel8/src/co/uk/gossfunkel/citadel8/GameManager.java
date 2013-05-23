package co.uk.gossfunkel.citadel8;

import com.badlogic.gdx.Game;
import co.uk.gossfunkel.citadel8.screens.SplashScreen;

public class GameManager extends Game {
	
	//TODO: motherfricking everything
	
	public static final String VERSION = "0.1";
	public static final String LOG = "Citadel8";
	
	@Override
	public void create() {
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {	
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
