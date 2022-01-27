package expenseReimbursement.bl;
import java.util.List;
import expenseReimbursement.models.createTicket;
import enums.Status;



public interface interTicketBL {
	abstract void addTicket(createTicket ticket); 
		List<createTicket> getTickets1();
		createTicket filteredTickets (Status status);
		createTicket getTicketById (int id) throws Exception;
	}


	
