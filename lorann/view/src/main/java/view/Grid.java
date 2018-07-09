package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Grid extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = -6371690572651419043L;

	/**
	 * Constructor
	 */
	public Grid() {
	}

	/**
	 * Draw the grid
	 * 
	 * @param g
	 */
	public void paintComponenent(final Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 400);

		g.setColor(Color.MAGENTA);
		// Grille
	}

}
