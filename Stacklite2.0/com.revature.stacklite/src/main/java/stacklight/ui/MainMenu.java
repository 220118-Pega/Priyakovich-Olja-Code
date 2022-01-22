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
				Issue newIssue = new Issue();
				System.out.println(newIssue);
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
}
