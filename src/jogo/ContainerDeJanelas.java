package jogo;
import javax.swing.JFrame;
import javax.swing.JButton;

public class ContainerDeJanelas extends JFrame {
	public ContainerDeJanelas(){
		add(new Fase());
		setTitle("Meu Jogo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,700);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContainerDeJanelas();
	}
}
