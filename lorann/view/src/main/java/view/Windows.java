package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.IController;

public class Windows extends JFrame implements KeyListener, IView {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;

	private IController controller;

	private final Menuu menuu = new Menuu();
	private final Grid grid = new Grid();
	private final Information info = new Information();

	public Windows() {
		this.setTitle("Tron");
		this.setSize(900, 430);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.getContentPane().setBackground(Color.BLACK);
		this.setContentPane(this.menuu);
		this.setVisible(true);
		this.addKeyListener(this);

	}

	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(final KeyEvent e) {

		switch (e.getKeyCode()) {

		case KeyEvent.VK_ENTER:
			this.controller.orderPerform(e.getKeyCode());
			this.repaint();

			this.getContentPane().setLayout(new BorderLayout());
			this.getContentPane().add("West", this.grid);
			this.getContentPane().add("East", this.info);
			this.setVisible(true);
			break;

		case KeyEvent.VK_Z:

			this.controller.orderPerform(e.getKeyCode());
			System.out.println("Haut");
			break;

		case KeyEvent.VK_Q:
			System.out.println("Gauche");
			this.controller.orderPerform(e.getKeyCode());
			break;

		case KeyEvent.VK_S:
			System.out.println("Bas");
			this.controller.orderPerform(e.getKeyCode());
			break;

		case KeyEvent.VK_D:
			System.out.println("Droite");
			this.controller.orderPerform(e.getKeyCode());
			break;

		case KeyEvent.VK_UP:
			System.out.println("Haut");
			this.controller.orderPerform(e.getKeyCode());
			break;

		case KeyEvent.VK_LEFT:
			System.out.println("Gauche");
			this.controller.orderPerform(e.getKeyCode());
			break;

		case KeyEvent.VK_DOWN:
			System.out.println("Bas");
			this.controller.orderPerform(e.getKeyCode());
			break;

		case KeyEvent.VK_RIGHT:
			System.out.println("Droite");
			this.controller.orderPerform(e.getKeyCode());
			break;

		// CHOIX DE PLUS QUE DEUX JOUEURS
		}

	}

	@Override
	public void keyReleased(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public IController getController() {
		return this.controller;
	}

	@Override
	public void setController(final IController controller) {
		this.controller = controller;
	}

	@Override
	public void displayMessage(final String message) {
		// TODO Auto-generated method stub

	}
}
