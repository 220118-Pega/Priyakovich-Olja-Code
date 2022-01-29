package dl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import Models.Employee;
import Models.Ticket;
import ui.Category;
import ui.Status;

public class InMemoryRepository implements IRepository {
	
	private static List<Ticket> listOfTickets;
	private static int latestId;
	
	public InMemoryRepository() {
		listOfTickets = new ArrayList<Ticket>() {{
			new Ticket(3.4, Status.pending, Category.Food, LocalDate.now(),"test",1);
		}};
	}
	
	public List<Ticket>getTickets() {
		return listOfTickets;
	}
	
	public List<Ticket>getticketsByEmployeeId(int employee_id) {
		return listOfTickets.stream().filter(ticket -> ticket.getEmployee_id()== employee_id).collect(Collectors.toList());
	}
	
	
	@Override
	public void addTicket(Ticket newTicket) {
		// TODO Auto-generated method stub
		newTicket.setId(latestId);
		listOfTickets.add(newTicket);
		latestId++;
		
	}

	@Override
	public List<Ticket> filterStatus(Status status) {
		// TODO Auto-generated method stub
		ArrayList<Ticket> filtered = new ArrayList<Ticket>();
		return listOfTickets.stream().filter(ticket -> ticket.getStatus().equals(status)).collect(Collectors.toList());
		
	}

	@Override
	public Ticket getTicketById(int id) throws Exception {
		// TODO Auto-generated method stub
		Ticket foundTicket = null;
		for(Ticket ticket: listOfTickets) {
			if(ticket.getId() == id) {
				foundTicket = ticket; 
			}
		}
		if(foundTicket == null) throw new Exception("Ticket not found");
		return foundTicket;
	}

	@Override
	public void updateTicket(Ticket newTicket) throws Exception {
		// TODO Auto-generated method stub
		Ticket foundTicket = getTicketById(newTicket.getId());
		foundTicket.setStatus(newTicket.getStatus());
		
	}

	@Override
	public void addEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public List<Ticket> getTicketsByEmloyeeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
