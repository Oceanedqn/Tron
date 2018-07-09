package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import contract.IController;
import contract.IView;

public class Windows extends JFrame implements KeyListener, IView {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;

	private IController controller;

	JButton bouton = new JButton("Start");
	private final Menuu menuu = new Menuu();

	public Windows() {
		this.setTitle("Tron");
		this.setSize(900, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.getContentPane().setBackground(Color.BLACK);
		// menuu.setLayout(new BorderLayout());
		// menuu.add(bouton, BorderLayout.SOUTH);
		// bouton.addActionListener(this);
		this.setContentPane(this.menuu);
		// this.requestFocusInWindow();
		this.setVisible(true);
		// On récupère ce que fais le clavier
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(final KeyEvent e) {
		this.controller.orderPerform(e.getKeyCode());
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
