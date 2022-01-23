package expenseReimbursement.ui;

import java.util.Scanner;

import expenseReimbursement.models.createTicket;

public class MainMenu {
	private Scanner myscanner;
	public MainMenu(Scanner myscanner) {
		this.myscanner = myscanner;
	}
	
	public void Start()
	{
		boolean keepgoing = true;
		do {
			System.out.println("What do you want to do?");
			System.out.println("[0] Request reimbursement");
			System.out.println("[1] View requested reimbursement");
			System.out.println("[x] Exit");
		
			String userInput = myscanner.nextLine();
			
			switch (userInput) {
			case "0":
				System.out.println("Requesting reimbursement");
				createTicket newTicket = new createTicket();
				System.out.println(newTicket);
				break;
			case "1":
				System.out.println("Viewing requested reimbursement");
				createTicket viewTicket = new createTicket();
				System.out.println(viewTicket);
				break;
			case "x":
				System.out.println("Goodbye");
				keepgoing = false;
				break;
			default:
				System.out.println("Sorry wrong input, please try again");
				break;
				
			}
			
			} while (keepgoing);
		
	}
}