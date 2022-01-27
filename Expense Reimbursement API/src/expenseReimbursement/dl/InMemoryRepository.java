package expenseReimbursement.dl;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import expenseReimbursement.enums.Type;
import expenseReimbursement.models.createTicket;

public class InMemoryRepository implements interfaceRepo {

	private static List<createTicket> ListTickets;
	private static int latestid;
	
	public InMemoryRepository() {
		ListTickets = new ArrayList<createTicket>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;{
			add(new createTicket(7.22, Status.status, null, LocalDate.now());
		}};
	};
	
	@Override
	public void addTicket(createTicket newTicket) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<createTicket> getTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public createTicket filteredTickets(Status status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public createTicket getticketById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public createTicket setTicketById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
