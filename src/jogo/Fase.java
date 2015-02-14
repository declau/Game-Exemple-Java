package jogo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener{
	
	

	private Image fundo;
	private Nave nave;
	private Timer timer;
	
public Fase(){
	
	setDoubleBuffered(true);
	setFocusable(true);
	addKeyListener(new TecladoAdapter());
	ImageIcon referencia = new ImageIcon("res\\fundo.png");
	fundo = referencia.getImage();
	
	nave = new Nave();
	
	timer = new Timer(5, this);
	timer.start();
}
public void paint(Graphics g){
	Graphics2D graficos = (Graphics2D) g;
	graficos.drawImage(fundo, 0,0, null);
	graficos.drawImage(nave.getImagem(), nave.getX(),nave.getY(), this);
	
	g.dispose();
}

@Override
public void actionPerformed(ActionEvent e) {
	nave.mexer();
	repaint();
	
}

private class TecladoAdapter extends KeyAdapter{

	@Override
	public void keyPressed(KeyEvent e) {
		nave.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		nave.KeyReleased(e);
	}
	
}
}
