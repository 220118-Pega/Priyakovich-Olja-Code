package expenseReimbursement.bl;

import java.util.List;

import enums.Status;
import expenseReimbursement.dl.interfaceRepo;
import expenseReimbursement.models.createTicket;

public class ticketBL implements interTicketBL{
	private interfaceRepo repo;
	
	public ticketBL(interfaceRepo repo) {
		this.repo = repo;
		
	
	}

	@Override
	public void addTicket(createTicket ticket) {
		// TODO Auto-generated method stub
		repo.addTicket(ticket);
		
	}

	@Override
	public List<createTicket> getTickets1() {
		// TODO Auto-generated method stub
		return repo.getTickets();
	}

	@Override
	public createTicket filteredTickets(Status status) {
		// TODO Auto-generated method stub
		return repo.filteredTickets(status);
	}

	@Override
	public createTicket getTicketById(int id) throws Exception {
		// TODO Auto-generated method stub
		return repo.getticketById(id);
	}

}
