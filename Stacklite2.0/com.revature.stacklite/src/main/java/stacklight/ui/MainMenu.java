package stacklight.ui;

import java.util.Scanner;

import stacklight.models.Issue;

public class MainMenu {
	private Scanner myscanner;
	
	public MainMenu(Scanner myscanner) {
		this.myscanner = myscanner;
	}
	
	
	public void start() {
		//method signature: assess modifier, non access modifier, return type, methodname,argument, throw exceptions.
		boolean keepgoing = true;
		
		do {
			System.out.println("Welcome to Stacklight, what do you wanna do?");
			System.out.println("[0) Create and issue");
			System.out.println("[x] Exit");
			
			String userInput = myscanner.nextLine();
			switch(userInput) {
			case "0":
				System.out.println("Creating an issue");
				createIssue();
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


	private void createIssue() {
		// TODO Auto-generated method stub
		System.out.println("Enter a title for your issue: ");
		String title = myscanner.nextLine();
		System.out.println("Enter a description for your isssue: ");
		String description = myscanner.nextLine();
		Issue newIssue = new Issue(title, description);
		//saving to storage
		System.out.println(newIssue);
	}
}
