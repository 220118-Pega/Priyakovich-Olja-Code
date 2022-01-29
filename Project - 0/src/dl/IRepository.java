package dl;

import java.util.List;

import Models.Employee;
import Models.Ticket;
import ui.Status;

public interface IRepository {
	List<Ticket>getTickets();
	List<Ticket>filterStatus(Status status);
	List<Ticket>getTicketsByEmloyeeId(int id);
	Ticket getTicketById(int id) throws Exception;
	void addTicket(Ticket newTicket);
	void updateTicket(Ticket newTicket) throws Exception;
	void addEmployee(Employee newEmployee);
	
	
	
	
}
