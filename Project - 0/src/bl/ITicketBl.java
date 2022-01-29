package bl;

import java.util.List;

import Models.Ticket;
import ui.Status;

public interface ITicketBl {
	List<Ticket> getTicket();
	List<Ticket> getTicketByEmployeeId(int employee_id);
	List<Ticket> filterStatus(Status status);
	Ticket getTicketById(int id) throws Exception;
	void addTicket(Ticket ticket);
	void updateTicket(Ticket ticket) throws Exception;
	
	
}
