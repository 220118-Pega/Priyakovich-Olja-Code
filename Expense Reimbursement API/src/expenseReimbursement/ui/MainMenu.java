package expenseReimbursement.ui;
import enums.Status;
import java.util.Scanner;
import expenseReimbursement.bl.interTicketBL;
import expenseReimbursement.bl.ticketBL;
import expenseReimbursement.enums.Type;
import expenseReimbursement.models.createTicket;

public class MainMenu {
	private Scanner myscanner;
	private interTicketBL ticketBL;
	
	public MainMenu(Scanner myscanner, interTicketBL ticketBL) {
		this.myscanner = myscanner;
		this.ticketBL = ticketBL;
	
	}

	public void Start()
	{
		boolean keepgoing = true;
		do {
			System.out.println("What do you want to do?");
			System.out.println("[1] Request reimbursement");
			System.out.println("[2] View requested reimbursement");
			System.out.println("[3] View reimbursement by id");
			System.out.println("[4] Exit");
		
			String userInput = myscanner.nextLine();
			
			switch (userInput) {
			case "1":
				System.out.println("Creating a reimbursement..");
				requestReimb();
				break;
			case "2":
				System.out.println("Viewing all reimbursements");
				viewreimb();
				break;
			case "3":
				System.out.println("Accessing Management system");
				viewReimbById();
			case "4":
				System.out.println("Goodbye");
				keepgoing = false;
				break;
			default:
				System.out.println("Sorry wrong input, please try again");
				break;
				
			}
			
		} while(keepgoing);
		
	}

	

	private void requestReimb() {
		
		System.out.println("Select type of your Reimbursement: ");
		System.out.println("Type:[L]LODGING, [T]TRAVEL, [F]FOOD,[0]OTHER");
		String userInput = myscanner.nextLine();
		System.out.println("Enter the amount:");
		double amount = Double.parseDouble(myscanner.nextLine());
		String select = myscanner.nextLine().toLowerCase();
		String userInput1 = myscanner.nextLine();
		
		Type type = null;
		switch (userInput1) {
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
			break;
		}
		createTicket newTicket = null;
		ticketBL ticketBL = new ticketBL(null);
		ticketBL.addTicket(newTicket);
		System.out.println(newTicket);
		
		
//		createTicket newTicket = new createTicket(amount, Status.pending, type, LocalDate.now());
	}
	private void viewreimb() {
		// TODO Auto-generated method stub
		for (createTicket ticket: ticketBL.getTickets1()) {
			System.out.println(ticket);
		}
		System.out.println("Tickets by status:[A] Approved, [P] Pending, [R] Rejected");
		System.out.println();
		String userInput = myscanner.nextLine().toLowerCase();
		createTicket filterTickets;
		switch (userInput) {
		case "a":
			filterTickets = ticketBL.filteredTickets(Status.approved());
			System.out.println(filterTickets);
			break;
		case "p":
			filterTickets = ticketBL.filteredTickets(Status.pending());
			System.out.println(filterTickets);
			break;
		case "r":
			filterTickets = ticketBL.filteredTickets(Status.rejected());
			System.out.println(filterTickets);
			break;
		case "x":
			System.out.print("Main Menu");
			break;
			
		default:
			System.out.println("Sorry wrong input, please try again");
			
		}	
	}
	
	private void viewReimbById() {
		System.out.println("Select ticket by ID:");
		for (createTicket ticket: ticketBL.getTickets1()) {
			System.out.println(ticket);
	}	
		int select = Integer.parseInt(myscanner.nextLine());
		createTicket selectedTicket;
		try {
			
			selectedTicket = ticketBL.getTicketById(select);
			System.out.println(selectedTicket);
			System.out.println("Update status: [A] Accept, [R] Rejected, [X]exit");
			String userInput = myscanner.nextLine().toLowerCase();
			switch (userInput) {
			case "a":
				selectedTicket.setStatus(Status.approved);
				System.out.println("Ticket Approved");
			case "r":
				selectedTicket.setStatus(Status.rejected);
				System.out.println("Ticket Rejected");
				break;
			case "x":
				System.out.println("Main Menu");
				break;
				
			default:
				break;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}
		
	
}
		
