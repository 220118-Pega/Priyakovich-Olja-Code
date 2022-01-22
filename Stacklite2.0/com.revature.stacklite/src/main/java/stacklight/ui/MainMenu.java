package stacklight.ui;

import java.util.Scanner;

import stacklight.bl.IIssueBL;
import stacklight.models.Issue;

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
			System.out.println("Welcome to Stacklight, what do you wanna do?");
			System.out.println("[0) Create and issue");
			System.out.println("[1] Get all issues");
			System.out.println("[x] Exit");
			
			String userInput = myscanner.nextLine();
			switch(userInput) {
			case "0":
				System.out.println("Creating an issue");
				createIssue();
				break;
			case "1":
				System.out.println("Getting issues...");
				getIssues();
				break;
			case "x":
				System.out.println("Goodbye");
				keepgoing = false;
				break;
			default:
				System.out.println("Sorry wrong input, please try again");
				break;
			}
			
		}while(keepgoing);
		
	}


	private void getIssues() {
		// TODO Auto-generated method stub
		for (Issue issue:issueBL.getIssues())
		{
			System.out.println(issue);
		}
	}


	private void createIssue() {
		// TODO Auto-generated method stub
		System.out.println("Enter a title for your issue: ");
		String title = myscanner.nextLine();
		System.out.println("Enter a description for your isssue: ");
		String description = myscanner.nextLine();
		Issue newIssue = new Issue(title, description);
		//saving to storage
		issueBL.addIssue(newIssue);
		System.out.println(newIssue);
	}
}
