package model;

public class calcModel {
	private int calculationValue;//contains the data
	
	//performs method needed
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		calculationValue = firstNumber + secondNumber;
	}
	
	//and provides access to the data
	public int getCaclculationValue() {
		return calculationValue;
	}

}
