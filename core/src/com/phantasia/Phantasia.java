package com.phantasia;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;
import com.phantasia.screens.PlayScreen;

public class Phantasia extends Game {
	public static final String TITLE = "Phantasia Mechanicae";
	public static final String VERSION = ".0.0.1";
	private TiledMap map;
	private TiledMapRenderer renderer;
	private OrthographicCamera camera;
	private AssetManager assetManager;
	private Texture tiles;
	private Texture texture;
	private BitmapFont font;
	private SpriteBatch batch;
	
	@Override
	public void create () {
		setScreen(new PlayScreen());
//		Gdx.app.debug("create", "Creating the app.");
//		int w = Gdx.graphics.getWidth();
//		int h = Gdx.graphics.getHeight();
//
//		camera = new OrthographicCamera();
//		camera.setToOrtho(false, w, h);
//		camera.update();
//		font = new BitmapFont();
//		batch = new SpriteBatch();
		
//		{
//			tiles = new Texture(Gdx.files.internal("iso-64x64-outside.png"));
//			TextureRegion[][] splitTiles = TextureRegion.split(tiles, 64, 64);
//			map = new TiledMap();
//			MapLayers layers = map.getLayers();
//			for (int l = 0; l < 1; l++) {
//				TiledMapTileLayer layer = new TiledMapTileLayer(150, 100, 64, 64);
//				for (int x = 0; x < 150; x++) {
//					for (int y = 0; y < 100; y++) {
//						int ty = (int)(Math.random() * splitTiles.length);
//						int tx = (int)(Math.random() * splitTiles[ty].length);
//						Cell cell = new Cell();
//						cell.setTile(new StaticTiledMapTile(splitTiles[ty][tx]));
//						layer.setCell(x, y, cell);
//					}
//				}
//				layers.add(layer);
//			}
//		}
		// only needed once
		//TiledMap map = new TmxMapLoader().load("maps/test_map.tmx");

		//renderer = new OrthogonalTiledMapRenderer(map);

	}

	@Override
	public void render () {
//		Gdx.gl.glClearColor(100f / 255f, 100f / 255f, 250f / 255f, 1f);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		camera.update();
//		renderer.setView(camera);
//		renderer.render();
//		batch.begin();
//		font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(), 10, 20);
//		batch.end();
		super.render();
	}
	
	@Override
	public void pause () {
		super.pause();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
	
	@Override
	public void resume () {
		super.resume();
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}
}
