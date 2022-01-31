package ui;


import java.time.LocalDate;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Models.Ticket;
import bl.IEmployeeBL;
import bl.ITicketBl;
import dl.EmployeeDAO;
import dl.TicketDAO;



public class MainMenu {
	private Scanner myscanner;
	private IEmployeeBL employeeBL;
	private ITicketBl ticketBL;
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	public MainMenu (Scanner myscanner, IEmployeeBL employeeBL, ITicketBl ticketBL) {
		this.myscanner = myscanner;
		this.employeeBL = employeeBL;
		this.ticketBL = ticketBL;
		
	}
	
	public MainMenu(Scanner scanner) {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		boolean keepgoing = true;
		do {
			System.out.println("Enter your name:");
			myscanner.nextLine();
			System.out.println("[1] Request reimbursemnt");
			System.out.println("[2] View my reimbursemnts");
			System.out.println("[3] View all reimbursements");
			System.out.println("[4] Update request");
			System.out.println("[x] Exit" );
			String userInput = myscanner.nextLine();
			switch (userInput) {
			case "1":
				createTicket();
			case "2":
				viewMyTickets();
				break;
			case "3":
				viewAllTickets();
				break;
			case "4":
				viwTicketsByid();
				break;
			default:
				System.out.println("Sorry wrong input, please try again");
				break;
				
			}
			
		}while(keepgoing);
	}

	private void createTicket() {
		// TODO Auto-generated method stub
//		String userInput = myscanner.nextLine();
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
			myscanner.nextLine().toLowerCase();
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
		Ticket newTicket = new Ticket(Status.pending, amount, category, LocalDate.now(),employee_id);
		ticketBL.addTicket(newTicket);
		System.out.println(newTicket);
		
	}
	
	private void viewMyTickets() {
		// TODO Auto-generated method stub
		System.out.println("Enter employee id number:");
		int employee_id = Integer.parseInt(myscanner.nextLine());
		for(Ticket ticket: ticketBL.getTicketByEmployeeId(employee_id)) {
				System.out.println(ticket);
			}
	}
	
	private void viewAllTickets() {
		// TODO Auto-generated method stub
		for(Ticket ticket: ticketBL.getTicket()) {
			System.out.println(ticket);
		}
		System.out.println("Status:[A]Approved, [P]Pending, [R]Rejected, [X]Go Back");
		String select = myscanner.nextLine().toLowerCase();
		switch (select) {
		case "a":
			for(Ticket ticket: ticketBL.filterStatus(Status.approved)) {
				System.out.println(ticket);
			}
			break;
		case "p":
			for(Ticket ticket: ticketBL.filterStatus(Status.pending)) {
				System.out.println(ticket);
			}
			break;
		case "r":
			for(Ticket ticket: ticketBL.filterStatus(Status.rejected)) {
				System.out.println(ticket);
			}
			break;
		case "x":
			System.out.println("Return to Main Menu");
			break;
		default:
			System.out.println("Sorry wrong input, please try again");
		}
		
	}
	
	private void viwTicketsByid() {
		// TODO Auto-generated method stub
		System.out.println("Select ticket by id:");
		for(Ticket ticket: ticketBL.getTicket()) {
			System.out.println(ticket);
		}
		int select = Integer.parseInt(myscanner.nextLine());
		Ticket selectedTicket;
		try {
			selectedTicket = ticketBL.getTicketById(select);
			System.out.println(selectedTicket);
			System.out.println("Update Status: [A] Accept, [R]Rejected, [X]Cancel");
			String userInput = myscanner.nextLine().toLowerCase();
			switch (userInput) {
			case "a":
				selectedTicket.setStatus(Status.approved);
				ticketBL.updateTicket(selectedTicket);
				System.out.println("Ticket Approved!");
				break;
			case "r":
				selectedTicket.setStatus(Status.rejected);
				ticketBL.updateTicket(selectedTicket);
				System.out.println("Ticket rejected!");
				break;
			case "x":
				System.out.println("Return to Main Menu");
			default:
				break;
			}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
			
	}

