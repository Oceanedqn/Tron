package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Windows extends JFrame implements KeyListener {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	JButton bouton = new JButton("Start");
	private final Menuu menuu = new Menuu();

	public Windows() {
		this.setTitle("Tron");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.getContentPane().setBackground(Color.BLACK);
		// menuu.setLayout(new BorderLayout());
		// menuu.add(bouton, BorderLayout.SOUTH);
		// bouton.addActionListener(this);
		this.setContentPane(this.menuu);
		this.setVisible(true);
		// On récupère ce que fais le clavier
		this.addKeyListener(this);
	}

	public void closeWindow() {
		this.setVisible(false);
	}

	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(final KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			this.closeWindow();
			System.out.println("caca");
			new Game();
		}
	}

	@Override
	public void keyReleased(final KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
