package entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import main.Game;

public abstract class Entity {
	
	protected double x;
	protected double y;
	protected int width,height;
	protected BufferedImage sprite;
	protected Game game;
	
	public Entity(double x, double y, int width, int height, BufferedImage sprite, Game game) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
		this.game = game;
		game.getEntities().add(this);
		if(this instanceof Tick) {
			game.getTicks().add((Tick)this);
		}
	}
	
	public Entity(double x, double y, int width, int height, Game game) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.game = game;
		if(this instanceof Tick) {
			game.getTicks().add((Tick)this);
		}
		game.getEntities().add(this);
	}
	
	public boolean collision(Entity e1, Entity e2) {
		Rectangle rec1 = new Rectangle((int)e1.getX(), (int)e1.getY(), e1.getWidth(), e1.getHeight());
		Rectangle rec2 = new Rectangle((int)e2.getX(), (int)e2.getY(), e2.getWidth(), e2.getHeight());
		
		return rec1.intersects(rec2);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public BufferedImage getSprite() {
		return sprite;
	}

	public void setSprite(BufferedImage sprite) {
		this.sprite = sprite;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, (int)x, (int)y, null);
	}
	
	
}
