package bl;

import java.util.ArrayList;

import Models.Employee;
import Models.Ticket;
import dl.IRepository;

public class EmployeeBL implements IEmployeeBL {
	private IRepository repo;
	
	
	
	public EmployeeBL(IRepository repo) {
		super();
		this.repo = repo;
	}


	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.addEmployee(employee);
		
	}


	@Override
	public void updateEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ticket getTicketById(int ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTicket(Ticket newTicket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Ticket> getTickets() {
		// TODO Auto-generated method stub
		return null;
	}}
	
	

