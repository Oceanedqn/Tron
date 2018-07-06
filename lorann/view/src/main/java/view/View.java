package view;

import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame  {

	
	public View() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(600,400);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setAlwaysOnTop(true);		
	//this.setContentPane(map);		
	this.setVisible(true);
	getContentPane().setBackground(Color.black);
	}
}
