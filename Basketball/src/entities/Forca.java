package entities;

import java.awt.Color;
import java.awt.Graphics;

import main.Game;

public class Forca extends Entity implements Tick{
	
	private boolean shoot;
	private int intensity;
	private Barra barra;
	private boolean down,up;
	
	public Forca(double x, double y, int width, int height, Game game) {
		super(x,y,width,height,game);
		this.barra = new Barra(x,y+height,width,1, game);
		this.up = true;
		this.intensity = 0;
	}
	
	public void tick() {
		if(shoot) {
			if(down) {
				barra.y++;
				intensity--;
			}else if(up) {
				barra.y--;
				intensity++;
			}
			if(barra.y+barra.height >= y+height) {
				up = true;
				down = false;
			}else if(barra.y <= y) {
				up = false;
				down = true;
			}
		}
	}
	
	public boolean isShoot() {
		return shoot;
	}

	public void setShoot(boolean shoot) {
		this.shoot = shoot;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	public void render(Graphics g) {
		if(shoot) {
			g.setColor(Color.WHITE);
			g.fillRect((int)x, (int)y, width, height);
			barra.render(g);
		}
	}
}
