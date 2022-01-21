package com.hangman.gui.panels;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component

public class EmptyPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmptyPanel () {
		this.setPreferredSize(new Dimension(500,100));
		this.setBackground(Color.BLACK);
		this.setLayout(new GridLayout(2, 1));
		
	}
}
