package expenseReimbursement.dl;

import java.io.ObjectInputFilter.Status;
import java.util.List;

import expenseReimbursement.models.createTicket;

public interface interfaceRepo {
	public void addTicket(createTicket newTicket);
		List<createTicket>getTickets();
		createTicket filteredTickets(Status status);
		createTicket getticketById(int id) throws Exception;
		createTicket setTicketById(int id) throws Exception;
		
}
