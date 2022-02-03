package Project0;

import java.util.Scanner;

import bl.EmployeeBL;
import bl.TicketBL;
import dl.DBRepository;
import dl.EmployeeDAO;
import dl.TicketDAO;
import ui.MainMenu;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMenu menu = 
				new MainMenu(
				new Scanner(System.in),
				new EmployeeBL(),
				new TicketBL(new DBRepository(new EmployeeDAO(), new TicketDAO())));
		menu.start();
	}

}
