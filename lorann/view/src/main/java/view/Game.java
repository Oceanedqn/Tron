package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Game extends JFrame implements KeyListener {
	/**
	 *
	 */
	private static final long serialVersionUID = -8395759457708163217L;
	private final Grid grid = new Grid();

	public Game() {
		this.setTitle("Game Tron");
		this.setSize(900, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		// this.setBackground(Color.BLACK);

		// grid.add(grid, 0, 0);

		this.setContentPane(this.grid);
		this.setVisible(true);
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(final KeyEvent e) {
	}

	@Override
	public void keyPressed(final KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_Z:
			// Insutrction aller en haut
			System.out.println("Haut");
			break;

		case KeyEvent.VK_Q:
			System.out.println("Gauche");
			// Insutrction aller GAUCHE
			break;

		case KeyEvent.VK_S:
			System.out.println("Bas");
			// Insutrction aller en BAS
			break;

		case KeyEvent.VK_D:
			System.out.println("Droite");
			// Insutrction aller DROITE
			break;

		case KeyEvent.VK_UP:
			System.out.println("Haut");
			// Insutrction aller en haut
			break;

		case KeyEvent.VK_LEFT:
			System.out.println("Gauche");
			// Insutrction aller en GAUCHE
			break;

		case KeyEvent.VK_DOWN:
			System.out.println("Bas");
			// Insutrction aller enBAS
			break;

		case KeyEvent.VK_RIGHT:
			System.out.println("Droite");
			// Insutrction aller en DROITE
			break;

		// CHOIX DE PLUS QUE DEUX JOUEURS
		}
	}

	@Override
	public void keyReleased(final KeyEvent e) {
		// La moto n'as pas le droit de s'arrêter
	}

	public Grid getGame() {
		return this.grid;
	}
}
