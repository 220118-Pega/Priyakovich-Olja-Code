package stacklight.ui;

import java.util.Scanner;

import stacklight.bl.IIssueBL;
import stacklight.models.Ticket;
import stacklight.models.Solution;


public class MainMenu {
	private Scanner myscanner;
	private IIssueBL issueBL;
	
	public MainMenu(Scanner myscanner, IIssueBL issueBL) {
		this.myscanner = myscanner;
		this.issueBL = issueBL;
	}
	
	
	public void start() {
		//method signature: assess modifier, non access modifier, return type, methodname,argument, throw exceptions.
		boolean keepgoing = true;
		
		do {
			System.out.println("Welcome, what do you wanna do?");
			System.out.println("[0) Request reimbursements");
			System.out.println("[1] View tickets");
			System.out.println("[2] View all tickets");
			System.out.println("[3] Update request");
			System.out.println("[x] Exit");
			
			String userInput = myscanner.nextLine();
			switch(userInput) {
			case "0":
				System.out.println("Creating ticket...");
				createIssue();
				break;
			case "1":
				System.out.println("View all tickets");
				getIssues();
				break;
			case "2":
				getSpecificIssue();
				break;
			case "3":
				addSolution();
				break;
			case "x":
				System.out.println("Goodbye!");
				keepgoing = false;
				break;
			default:
				System.out.println("Sorry wrong input, please try again");
				break;
			}
			
		}while(keepgoing);
		
	}


	private void addSolution() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the issue you'd like to view the solutions for: ");
		String stringId = myscanner.nextLine();
		System.out.println("Enter the answer to your proposed solution");
		String answer = myscanner.nextLine();
		Solution newSolution = new Solution(answer);
		try {
			newSolution.setIssueId(Integer.parseInt(stringId));
			issueBL.addSolution(newSolution);
		} catch (NumberFormatException ex) {
			System.out.println("Please enter only numerics");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No such issue found, try another id. ");
		}
	}

	private void getSpecificIssue() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the issue you'd like to add a solution to: ");
		String stringId = myscanner.nextLine();
		Ticket foundIssue;
		try {
			foundIssue = issueBL.getIssueById(Integer.parseInt(stringId));
			for(Solution solution:foundIssue.getSolutions())
			{
			System.out.println(solution);
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			System.out.println("Plese only enter numerics");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("No such issue found, try another id. ");
		}
		
		
	}


	private void getIssues() {
		// TODO Auto-generated method stub
		for (Ticket issue:issueBL.getIssues())
		{
			System.out.println(issue);
		}
	}


	private void createIssue() {
		// TODO Auto-generated method stub
		System.out.println("Enter a title for your ticket: ");
		String title = myscanner.nextLine();
		System.out.println("Enter a description for your ticket: ");
		String description = myscanner.nextLine();
		Ticket newIssue = new Ticket(title, description);
		//saving to storage
		issueBL.addIssue(newIssue);
		System.out.println(newIssue);
	}
}
