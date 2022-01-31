package entities;

import java.awt.Color;
import java.awt.Graphics;

import main.Game;

public class Barra extends Entity{
	
	public Barra(double x, double y, int width, int height, Game game) {
		super(x,y,width,height,game);
		game.getEntities().remove(this);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect((int)x,(int)y,width,height);
	}
}
