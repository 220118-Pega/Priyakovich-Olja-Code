package bl;

import java.util.List;

import Models.Ticket;
import dl.IRepository;
import ui.Status;



public class TicketBL implements ITicketBl{
	private IRepository repo;
	
	public TicketBL(IRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Ticket> getTicket() {
		// TODO Auto-generated method stub
		return repo.getTickets();
	}

	@Override
	public List<Ticket> getTicketByEmployeeId(int id) {
		// TODO Auto-generated method stub
		return repo.getTicketsByEmloyeeId(id);
	}

	@Override
	public List<Ticket> filterStatus(Status status) {
		// TODO Auto-generated method stub
		return repo.filterStatus(status);
	}

	@Override
	public Ticket getTicketById(int id) throws Exception {
		// TODO Auto-generated method stub
		return repo.getTicketById(id);
	}

	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		repo.addTicket(ticket);
	}

	@Override
	public void updateTicket(Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		repo.updateTicket(ticket);
	}
	
	
}
