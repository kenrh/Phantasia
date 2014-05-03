package com.phantasia.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.phantasia.Phantasia;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Phantasia.TITLE + " v" + Phantasia.VERSION;
		config.useGL30 = true;
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new Phantasia(), config);
	}
}
