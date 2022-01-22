package view;

import java.awt.event.ActionListener; //catch events whenever user click on events


import javax.swing.*;


public class calcView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	public calcView(){
		
		JPanel calcPanel = new JPanel();//display on the screen 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
	}
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText()); 
	}
	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText()); 
	}
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText()); 
	}
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	public void addCalculationListener(ActionListener listenForCalcButton) {
		calculateButton.addActionListener(listenForCalcButton);
	}
	
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
}
