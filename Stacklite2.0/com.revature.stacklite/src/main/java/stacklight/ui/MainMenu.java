package stacklight.ui;

import java.util.Scanner;

import stacklight.bl.IIssueBL;
import stacklight.models.Issue;
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
			System.out.println("Welcome to Stacklight, what do you wanna do?");
			System.out.println("[0) Create an issue");
			System.out.println("[1] Get all issues");
			System.out.println("[2] View issue with proposed solution");
			System.out.println("[3] Add proposed solution to issue");
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
			case "2":
				getSpecificIssue();
				break;
			case "3":
				addSolution();
				break;
			case "x":
				System.out.println("I'll see you soon ;)!");
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
		newSolution.setIssueId(Integer.parseInt(stringId));
		issueBL.addSolution(newSolution);
	}


	private void getSpecificIssue() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the issue you'd like to add a solution to: ");
		String stringId = myscanner.nextLine();
		Issue foundIssue = issueBL.getIssueById(Integer.parseInt(stringId));
		System.out.println(foundIssue);
		try {
			for(Solution solution:foundIssue.getSolutions())
			{
			System.out.println(solution);
			}
		} catch (NullPointerException e)
		{
			System.out.println("No such issue found, try another id. ");
		}
		
		
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
