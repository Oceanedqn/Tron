package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Information extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = -2944462490265909702L;

	@Override
	public void paintComponent(final Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(601, 0, 300, 400); // BACKGROUND GRAY
		g.setColor(Color.WHITE);
		g.drawString("Party information ", 620, 50);
		g.drawString("Timer : ", 625, 70);

	}
}
