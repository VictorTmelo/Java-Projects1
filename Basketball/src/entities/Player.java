package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Game;

public class Player extends Entity implements Tick{

	private boolean left,right,dirRight,dirLeft;
	private int index,frames;
	private double speed;
	private BufferedImage[] leftPlayer, rightPlayer;
	
	public Player(double x, double y, int width, int height, Game game) {
		super(x, y, width, height, game);
		index = 0;
		speed = 1.5;
		dirRight = true;
		leftPlayer = new BufferedImage[4];
		rightPlayer = new BufferedImage[4];
		for(int i=0; i<leftPlayer.length; i++) {
			leftPlayer[i] = game.getSpritesheet().getSprite(i*16, 13, width, height);
			rightPlayer[i] = game.getSpritesheet().getSprite(i*16, 33, width, height);
		}
	}
	
	public void tick() {
		if(right) {
			dirRight = true;
			dirLeft = false;
			x+=speed;
		}else if(left) {
			dirRight = false;
			dirLeft = true;
			x-=speed;
		}
		if(right || left) {
			frames++;
			if(frames == 5) {
				frames = 0;
				index++;
				if(index > 3) {
					index = 0;
				}
			}
		}
		if(x <= 0) {
			x = 0;
		}else if(x+width >= game.getWIDTH()) {
			x = game.getWIDTH()-width;
		}
		
	}
	
	public boolean collidesWithBall() {
		return collision(this,game.getBall());
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isDirRight() {
		return dirRight;
	}

	public void setDirRight(boolean dirRight) {
		this.dirRight = dirRight;
	}

	public boolean isDirLeft() {
		return dirLeft;
	}

	public void setDirLeft(boolean dirLeft) {
		this.dirLeft = dirLeft;
	}

	public void render(Graphics g) {
		if(dirRight) {
			g.drawImage(rightPlayer[index], (int)x, (int)y, null);
		}else if(dirLeft) {
			g.drawImage(leftPlayer[index], (int)x, (int)y, null);
		}
	}

}
