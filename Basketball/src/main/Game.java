package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;

import entities.Ball;
import entities.Basket;
import entities.Entity;
import entities.Forca;
import entities.Player;
import entities.Tabela;
import entities.Tick;
import graphics.Spritesheet;


public class Game extends Canvas implements Runnable, KeyListener{

	private static final long serialVersionUID = 1L;
	private final int WIDTH = 150;
	private final int HEIGHT = 100;
	private final int SCALE = 4;
	
	private Thread thread;
	private boolean isRunning;
	private JFrame frame;
	private BufferedImage image;
	
	private ArrayList<Entity> entities;
	private ArrayList<Tick> ticks;
	private Tabela tabela;
	private Spritesheet spritesheet;
	private Basket basket;
	private Ball ball;
	private Player player;
	private Forca forca;
	
	public Game() {
		setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		getFrames();
		addKeyListener(this);
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		entities = new ArrayList<>();
		ticks = new ArrayList<>();
		spritesheet = new Spritesheet("/Basketball/res/Spritesheet.png");
		tabela = new Tabela(20,20,15,13, spritesheet.getSprite(0, 0, 15, 13),this);
		ball = new Ball(WIDTH/2,HEIGHT-5, 5, 5, spritesheet.getSprite(43, 0, 5, 5), this);
		basket = new Basket(tabela.getX()+4,tabela.getY()+12,7,4, this);
		player = new Player(WIDTH/2, HEIGHT-20,16,20,this);
		forca = new Forca(WIDTH-20,HEIGHT/8,5,25,this);
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	
	public void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void getFrames() {
		frame = new JFrame("Meu jogo!");
		frame.add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public void tick() {
		for(Tick t:ticks) {
			t.tick();
		}
	}
	
	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = image.getGraphics();
		g.setColor(Color.green);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		for(Entity e:entities) {
			e.render(g);
		}
		
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, WIDTH*SCALE, HEIGHT*SCALE, null);
		
		bs.show();
	}

	public void run() {
		requestFocus();
		long lastTime = System.nanoTime();
		double deltaTime = 0;
		double amountofticks = 60;
		double ns = 1000000000/amountofticks;
		int frames = 0;
		double timer = System.currentTimeMillis();
		while(isRunning) {
			long now = System.nanoTime();
			deltaTime += (now - lastTime)/ns;
			lastTime = now;
			if(deltaTime >= 1) {
				frames++;
				deltaTime--;
				tick();
				render();
			}
			if(System.currentTimeMillis() - timer >= 1000) {
				timer+=1000;
				System.out.println("FPS: "+frames);
				frames = 0;
			}
		}
		stop();
		
	}

	public Ball getBall() {
		return ball;
	}

	public Player getPlayer() {
		return player;
	}

	public int getWIDTH() {
		return WIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

	public int getSCALE() {
		return SCALE;
	}

	public Spritesheet getSpritesheet() {
		return spritesheet;
	}

	public void setSpritesheet(Spritesheet spritesheet) {
		this.spritesheet = spritesheet;
	}

	public Forca getForca() {
		return forca;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public ArrayList<Tick> getTicks() {
		return ticks;
	}

	public void keyTyped(KeyEvent e) {
		
		
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT && !forca.isShoot()) {
			player.setRight(true);
			player.setDirLeft(false);
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT && !forca.isShoot()) {
			player.setLeft(true);
			player.setDirRight(false);
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE && player.collidesWithBall() && !ball.isShoot()) {
			ball.setWithPlayer(true);
		}
		if(e.getKeyCode() == KeyEvent.VK_Z && ball.isWithPlayer()) {
			forca.setShoot(true);
			ball.setWithPlayer(false);
			ball.setSpeedy(0);
			ball.setY(player.getY()+player.getHeight()/2);
			player.setRight(false);
			player.setLeft(false);
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.setRight(false);
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.setLeft(false);
		}
		if(e.getKeyCode() == KeyEvent.VK_Z) {
			forca.setShoot(false);
			ball.setSpeedx(forca.getIntensity()*0.1*Math.cos(Math.PI/3));
			ball.setSpeedy(forca.getIntensity()*0.1*Math.sin(Math.PI/3));
			ball.setShoot(true);
			//forca.setIntensity(0);
			ball.setDy(-1);
			ball.setDx(-1);
		}
		
	}

}
