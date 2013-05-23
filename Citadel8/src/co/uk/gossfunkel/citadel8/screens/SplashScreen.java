package co.uk.gossfunkel.citadel8.screens;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenEquations;
import aurelienribon.tweenengine.TweenManager;
import co.uk.gossfunkel.citadel8.GameManager;
import co.uk.gossfunkel.citadel8.SpriteTween;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SplashScreen implements Screen {
	
	private Texture splashTexture;
	private Sprite splashSprite;
	private SpriteBatch batch;
	private GameManager game;
	private TweenManager manager;
	
	public SplashScreen(GameManager game) {
		this.game = game;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		manager.update(delta);
		//Gdx.app.log(GameManager.LOG, "Rendering");
		
		batch.begin(); {
			splashSprite.draw(batch);
		} batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// might not be used
		//TODO: add fullscreen mode
	}

	@Override
	public void show() {
		splashTexture = new Texture(Gdx.files.internal("data/splashscreen.jpg"));
		splashTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		splashSprite = new Sprite(splashTexture);
		splashSprite.setColor(1, 1, 1, 0);
		//splashSprite.setOrigin(splashSprite.getWidth()/2, splashSprite.getHeight()/2);
		//splashSprite.setPosition(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
		
		batch = new SpriteBatch();
		
		Tween.registerAccessor(Sprite.class, new SpriteTween());
		
		manager = new TweenManager();
		
		Tween.to(splashSprite, SpriteTween.ALPHA, 3f).target(1)
			.ease(TweenEquations.easeInQuad).start(manager);
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}
	
	

}
