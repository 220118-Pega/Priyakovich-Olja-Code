package expenseReimbursement;

import java.util.Scanner;

import expenseReimbursement.models.createTicket;
import expenseReimbursement.ui.MainMenu;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainMenu menu = new MainMenu(new Scanner(System.in));
		menu.Start();
		
	}
	

}
