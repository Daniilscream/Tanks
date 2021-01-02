package ru.Daniilscream.tanks.graphics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import ru.Daniilscream.tanks.utils.Utils;

public class Sprite {
	
	private SpriteSheet sheet;
	private float scale;
	private BufferedImage image;

	public Sprite(SpriteSheet sheet, float scale) {
		this.scale = scale;
		this.sheet = sheet;
		image = sheet.getSprite(0);
		image=Utils.resize(image, (int)(image.getWidth()*scale),(int)(image.getHeight()*scale));
	}
	
	public void render(Graphics2D g, float x, float y) {
		
		g.drawImage(image,(int) x, (int) y, null);
	}

}
