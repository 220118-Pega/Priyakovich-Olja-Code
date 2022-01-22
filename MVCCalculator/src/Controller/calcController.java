package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//The controller coordinates interaction 
//between the view and Model

import model.calcModel;
import view.calcView;

public class calcController {

	private calcView theView;
	private calcModel theModel;
	
	public calcController(calcView theView, calcModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int firstNumber, secondNumber = 0;
			
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCaclculationValue());
			}
			catch(NumberFormatException ex) {
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers!");
			}
			
		}
		
	}


}
