package expenseReimbursement.dl;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import enums.*;

import expenseReimbursement.enums.Type;
import expenseReimbursement.models.createTicket;

public class InMemoryRepository implements interfaceRepo {

	private static List<createTicket> listOfTickets;
	private static int latestId;
	
	
	@SuppressWarnings("serial")
	public InMemoryRepository() {
		listOfTickets = new ArrayList<createTicket>(){{
			new createTicket(new createTicket(44, Status.pending, Type.Lodging, LocalDate.now(),1));
		}};
	};


	
	@Override
	public void addTicket(createTicket newTicket) {
		newTicket.setId(latestId);
		List<createTicket> listOfTicket = null; 
		listOfTicket.add(newTicket);
		latestId++;
		
		
	}

	@Override
	public List<createTicket> getTickets() {
		// TODO Auto-generated method stub
		return listOfTickets;
	}

	@Override
	public createTicket filteredTickets(Status status) {
		// TODO Auto-generated method stub
		createTicket filter = null;
		for (createTicket tickets: listOfTickets) {
			if (tickets.getStatus() == status) {
				filter = tickets;
			}
		}
		return filter;
	}

	@Override
	public createTicket getticketById(int id) throws Exception {
		// TODO Auto-generated method stub
		createTicket foundTicket = null;
		for (createTicket ticket: listOfTickets) {
			if (ticket.getId() ==id) {
				foundTicket = ticket;
			}
		}
		return null;
	}

	@Override
	public createTicket setTicketById(int id) throws Exception {
		// TODO Auto-generated method stub
		createTicket updateTicket = getticketById(id);
		return updateTicket;
	}

	@Override
	public createTicket filteredTickets(enums.Status status) {
		// TODO Auto-generated method stub
		return null;
	}


}
