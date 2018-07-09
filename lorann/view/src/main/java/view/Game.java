package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Game extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = -6371690572651419043L;

	/**
	 * Constructor
	 */
	public Game() {

	}

	/**
	 * Draw the grid
	 *
	 * @param g
	 */

	@Override
	public void paintComponent(final Graphics g) {

		// ############################################################################
		// ################################## Grid ####################################
		// ############################################################################
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 400); // BACKGROUND BLACK
		g.setColor(Color.GRAY);
		g.setColor(Color.WHITE);

		g.drawLine(600, 0, 600, 400);
		final int uniteX = 600 / 30;
		final int uniteY = 400 / 20;

		for (int i = 0; i < 30; i++) {
			g.drawLine(uniteX * i, 0, uniteX * i, 400);
			g.drawLine(0, uniteY * i, 600, uniteY * i);
		}

		// ############################################################################
		// ################################## Info ####################################
		// ############################################################################
		g.setColor(Color.GRAY);
		g.fillRect(601, 0, 300, 400); // BACKGROUND GRAY
		g.setColor(Color.WHITE);
		g.drawString("Party information ", 620, 50);
		g.drawString("Timer : ", 625, 70);

	}
}
