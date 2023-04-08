package thurWebGame.Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{

	static final int LARGURA_TELA = 300;
	static final int ALTURA_TELA = 300;
	int x = 100;
	int xdir = 10;
	int xTam = 15;
	int y = 30;
	int ydir = 10;
	int yTam = 15;
	
	int x1 = 200;
	int x1dir = 10;
	int x1Tam = 15;
	int y1 = 30;
	int y1dir = 10;
	int y1Tam = 15;
	
	int x2 = 250;
	int x2dir = 10;
	int x2Tam = 15;
	int y2 = 30;
	int y2dir = 10;
	int y2Tam = 15;
	
	GamePanel(){
		this.setPreferredSize(new Dimension(LARGURA_TELA, ALTURA_TELA));
		this.setBackground(Color.BLACK);
		this.setFocusable(true);
		Thread tread = new Thread(this);
		tread.start();
	}
	public void update() {
		x = x + xdir;
		y = y + ydir;
		if(x >= (LARGURA_TELA - xTam) || x < 0) {
			xdir *= -1;
		}
		if(y > (LARGURA_TELA - yTam) || y < 0) {
			ydir *= -1;
		}
		
		x1 = x1 + x1dir;
		y1 = y1 + y1dir;
		if(x1 >= (LARGURA_TELA - x1Tam) || x1 < 0) {
			x1dir *= -1;
		}
		if(y1 > (LARGURA_TELA - y1Tam) || y1 < 0) {
			y1dir *= -1;
		}
		
		x2 = x2 + x2dir;
		y2 = y2 + y2dir;
		if(x2 >= (LARGURA_TELA - x2Tam) || x2 < 0) {
			x2dir *= -1;
		}
		if(y2 > (LARGURA_TELA - y2Tam) || y2 < 0) {
			y2dir *= -1;
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, xTam, yTam);
		
		g.setColor(Color.GRAY);
		g.fillOval(x1, y1, x1Tam, y1Tam);
		
		g.setColor(Color.green);
		g.fillOval(x2, y2, x2Tam, y2Tam);
	}
	public void sleep() {
		try {
			Thread.sleep(70);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		while(true) {
			update();
			repaint();
			sleep();
		}
	}
}
