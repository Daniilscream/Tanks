package ru.Daniilscream.tanks.game;

import java.awt.Graphics2D;

import ru.Daniilscream.tanks.IO.Input;

public abstract class Entity {

	public final EntityType type;
	
	protected float x;
	protected float y;
	
	protected Entity(EntityType type, float x, float y) {
		this.type = type;
		this.x = x;
		this.y = y;
	}
	
	public abstract void update(Input in);
	
	public abstract void render(Graphics2D g);
}
