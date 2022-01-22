package stacklight;

import java.util.Scanner;

import stacklight.bl.IssueBL;
import stacklight.ui.MainMenu;
import stacklight.dl.InMemoryRepository; 

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainMenu menu = new MainMenu(new Scanner(System.in), new IssueBL(new InMemoryRepository()));
		menu.start();
	}

}
