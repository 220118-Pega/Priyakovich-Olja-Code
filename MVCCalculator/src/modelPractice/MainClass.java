package modelPractice;

import Controller.calcController;
import model.calcModel;
import view.calcView;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcView theView = new calcView();
		calcModel theModel = new calcModel();
		calcController theController = new calcController(theView, theModel);
		
		theView.setVisible(true);
	}

}
