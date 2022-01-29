package ui;


import java.util.Scanner;


public class MainMenu {
	private Scanner myscanner;
	public MainMenu (Scanner myscanner) {
		this.myscanner = myscanner;
	
		
	}
	
	public void start() {
		boolean keepgoing = true;
		do {
			System.out.println("[1] Request reimbursemnt");
			System.out.println("[2] View my reimbursemnts");
			System.out.println("[3] View all reimbursements");
			System.out.println("[4] Update request");
			System.out.println("[x] Exit" );
			String userInput = myscanner.nextLine();
			switch (userInput) {
			case "1":
				System.out.println("creating ticket...");
				createTicket();
			case "2":
				System.out.println("view my ticket");
				break;
			case "3":
				System.out.println("view all tickets");
				break;
			case "4":
				System.out.println("view ticket my id");
				break;
			default:
				System.out.println("Sorry wrong input, please try again");
				break;
			
						
			}
			
		}while(keepgoing);
	}

	@SuppressWarnings("unused")
	private void createTicket() {
		// TODO Auto-generated method stub
		System.out.println("Enter employee id:");
		int employee_id = Integer.parseInt(myscanner.nextLine());
		System.out.println("Enter the amount:");
		double amount = Double.parseDouble(myscanner.nextLine());
		System.out.println("What type: [L]LODGING, [T]TRAVEL,[F]FOOD,[E]ENTERTAINMENT[O]OTHER");
		String select = myscanner.nextLine().toLowerCase();
		Category category = null;
		
		switch(select) {
		case "l":
			category = Category.Lodging;
			break;
		case "t":
			category = Category.Travel;
			break;
		case "f":
			category = Category.Food;
			break;
		case "e":
			category = Category.Entertainment;
			break;
		case "o":
			category = Category.Other;
		default:
			System.out.println("Wrong input, please try again");
			break;
			
		}
		
	}
	
}





















