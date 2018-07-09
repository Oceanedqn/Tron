package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.IController;
import controller.Order;

public class Windows extends JFrame implements KeyListener {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;

	private final int width = 900;
	private final int height = 430;
	private IController controller;

	private final Menuu menuu = new Menuu();
	private final GamePanel grid = new GamePanel();

	/**
	 * Constructor
	 */
	public Windows() {

		this.setTitle("Tron");
		this.setSize(this.width, this.height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.getContentPane().setBackground(Color.BLACK);
		this.getContentPane().add(this.menuu);
		// this.setVisible(true);
		this.addKeyListener(this);

	}

	@Override
	public void repaint() {
		this.grid.repaint();
	}

	public GamePanel getGamePanel() {
		return this.grid;
	}

	/**
	 * getter of the width attribute
	 *
	 * @return Get width
	 */
	@Override
	public int getWidth() {
		return this.width;
	}

	/**
	 * geter of the width attribute
	 */
	@Override
	public int getHeight() {
		return this.height;
	}

	public IController getController() {
		return this.controller;
	}

	public void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * methode used to capture the user's actions and send them to the controller
	 */
	@Override
	public void keyPressed(final KeyEvent e) {

		switch (e.getKeyCode()) {

		case KeyEvent.VK_ENTER:
			System.out.println("YO");
			this.controller.orderPerform(Order.ENTER);
			System.out.println("YAS");
			// this.setContentPane(this.grid);
			// this.setVisible(true);
			break;

		case KeyEvent.VK_Z:
			this.controller.orderPerform(Order.UP);
			System.out.println("Haut");
			break;

		case KeyEvent.VK_Q:
			System.out.println("Gauche");
			this.controller.orderPerform(Order.LEFT);
			break;

		case KeyEvent.VK_S:
			System.out.println("Bas");
			this.controller.orderPerform(Order.DOWN);
			break;

		case KeyEvent.VK_D:
			System.out.println("Droite");
			this.controller.orderPerform(Order.RIGHT);
			break;

		case KeyEvent.VK_UP:
			System.out.println("Haut");
			this.controller.orderPerform(Order.UP);
			break;

		case KeyEvent.VK_LEFT:
			System.out.println("Gauche");
			this.controller.orderPerform(Order.LEFT);
			break;

		case KeyEvent.VK_DOWN:
			System.out.println("Bas");
			this.controller.orderPerform(Order.DOWN);
			break;

		case KeyEvent.VK_RIGHT:
			System.out.println("Droite");
			this.controller.orderPerform(Order.RIGHT);
			break;

		// CHOIX DE PLUS QUE DEUX JOUEURS
		}

	}

	@Override
	public void keyReleased(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
