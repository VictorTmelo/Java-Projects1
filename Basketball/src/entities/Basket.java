package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Game;

public class Basket extends Entity implements Tick{
	
	private int index;
	private boolean cesta;
	private int frames;
	private BufferedImage[] sprite;
	
	public Basket(double x, double y, int width, int height, Game game) {
		super(x, y, width, height, game);
		index = 0;
		sprite = new BufferedImage[4];
		for(int i=0; i<sprite.length; i++) {
			sprite[i] = game.getSpritesheet().getSprite(15+7*i, 0, width, height);
		}
	}
	
	public void tick() {
		if(cesta) {
			game.getBall().setGravity(0);
			game.getBall().setSpeedx(0);
			game.getBall().setDy(1);
			frames++;
			if(frames == 15) {
				frames = 0;
				index++;
				if(index == sprite.length) {
					index = 0;
					cesta = false;
				}
			}
		}else if(collision(this, game.getBall())) {
			game.getBall().setDx(game.getBall().getDx()*-1);
			//cesta = true;
		}else if(game.getBall().getX() > x 
				&& game.getBall().getX()+game.getBall().getWidth() < x+width
				&& this.collision(this, game.getBall())
				&& game.getBall().getDy() > 0) {
			cesta = true;
		}
	}
	
	
	
	public boolean isCesta() {
		return cesta;
	}

	public void setCesta(boolean cesta) {
		this.cesta = cesta;
	}

	public void render(Graphics g) {
		g.drawImage(sprite[index], (int)x, (int)y, null);
	}
}
