package expenseReimbursement.ui;


import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.util.Scanner;

import expenseReimbursement.bl.ticketBL;
import expenseReimbursement.enums.Type;
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
			System.out.println("[1] Request reimbursement");
			System.out.println("[2] View requested reimbursement");
			System.out.println("[3] Exit");
		
			String userInput = myscanner.nextLine();
			
			switch (userInput) {
			case "1":
				requestReimb();
				break;
			case "2":
				viewReimb();
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


	private void requestReimb() {
		// TODO Auto-generated method stub
		System.out.println("Select type of your Reimbursement: ");
		System.out.println(myscanner.nextLine());
		System.out.println("Type:[L]LODGING, [T]TRAVEL, [F]FOOD,[0]OTHER");
		System.out.println(myscanner.nextLine());
		String select = myscanner.nextLine().toLowerCase();
		Type type = null;
		switch (select) {
		case "l":
			type = Type.Lodging; 
			break;
		case "t":
			type = Type.Travel;
			break;
		case "f":
			type = Type.Food;
			break;
		case "0":
			type = Type.Other; 
			break;
		default:
			System.out.println("Sorry wrong input, please try again");
		}
		
		
	}
		
	
	
	
	
	private void viewReimb() {
			// TODO Auto-generated method stub

		
		
	}
}