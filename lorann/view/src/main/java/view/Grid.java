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

	@Override
	public void paintComponent(final Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 400); // BACKGROUND BLACK
		g.setColor(Color.GRAY);
		g.setColor(Color.WHITE);
		final int uniteX = 600 / 30;
		final int uniteY = 400 / 20;

		for (int i = 0; i < 30; i++) {
			g.drawLine(uniteX * i, 0, uniteX * i, 400);
			g.drawLine(0, uniteY * i, 600, uniteY * i);
		}
	}
}
