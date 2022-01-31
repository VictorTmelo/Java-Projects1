package entities;

import java.awt.image.BufferedImage;

import main.Game;

public class Ball extends Entity implements Tick{

	private boolean withPlayer,up,down,shoot,transicao;
	private double speedx, speedy;
	private double gravity;
	private int dx,dy;
	
	public Ball(double x, double y, int width, int height, BufferedImage sprite, Game game) {
		super(x, y, width, height, sprite, game);
		this.speedx = 0;
		this.speedy = 0;
		this.dx = 1;
		this.dy = -1;
		this.shoot = true;
	}
	
	public void tick() {
		if(withPlayer) {
			if(game.getPlayer().isDirRight()) {
				x = game.getPlayer().x+12;
			}else {
				x = game.getPlayer().x-4;
			}
			quique();
		}else if(shoot){
			if(y+height >= game.getHEIGHT()) {
				y = game.getHEIGHT()-height;
				shoot = false;
				speedy = 0;
				speedx = 0;
				gravity = 0;
			}else {
				gravity += 0.02;
			}
			if(x <= 0) {
				dx*=-1;
			}
			if(x+width >= game.getWIDTH()) {
				dx*=-1;
			}
			if(y<0) {
				dy*=-1;
			}
		}
		
		x += speedx*dx;
		y += speedy*dy+gravity;	
		
	}
	
	public void quique() {
		speedy = 0.7;
		if(up) {
			dy = -1;
			if(y < game.getPlayer().y+(game.getPlayer().height)/2) {
				up = false;
				down = true;
			}
		}else if(down) {
			dy = 1;
		}
		if(y+height >= game.getHEIGHT()) {
			up = true;
			down = false;
		}
	}

	public boolean isWithPlayer() {
		return withPlayer;
	}

	public void setWithPlayer(boolean withPlayer) {
		this.withPlayer = withPlayer;
	}

	public boolean isShoot() {
		return shoot;
	}

	public void setShoot(boolean shoot) {
		this.shoot = shoot;
	}

	public boolean isTransicao() {
		return transicao;
	}

	public void setTransicao(boolean transicao) {
		this.transicao = transicao;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public double getSpeedx() {
		return speedx;
	}

	public void setSpeedx(double speedx) {
		this.speedx = speedx;
	}

	public double getSpeedy() {
		return speedy;
	}

	public void setSpeedy(double speedy) {
		this.speedy = speedy;
	}

	public double getGravity() {
		return gravity;
	}

	public void setGravity(double gravity) {
		this.gravity = gravity;
	}
	

}
