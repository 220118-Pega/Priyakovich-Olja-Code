package dl;

import java.util.List;
import Models.Employee;
import Models.Ticket;
import ui.Status;
import ui.Category;

public class DBRepository implements IRepository{
	private DAO<Employee, Integer> employeeDAO;
	private DAO<Ticket, Integer> ticketDAO;
	
	public DBRepository(DAO<Employee, Integer> employeeDAO, DAO<Ticket,Integer> ticketDAO)
	{
		this.employeeDAO = employeeDAO;
		this.ticketDAO = ticketDAO;
	}
	
	
	@Override
	public List<Ticket> getTickets() {
		// TODO Auto-generated method stub
		return ticketDAO.findAllTickets();
	}

	@Override
	public List<Ticket> filterStatus(Status status) {
		// TODO Auto-generated method stub
		return ticketDAO.filterStatus(status);
	}

	@Override
	public List<Ticket> getTicketsByEmloyeeId(int id) {
		// TODO Auto-generated method stub
		return ticketDAO.getTicketbyEmployeeId(id);
	}

	@Override
	public Ticket getTicketById(int id) throws Exception {
		// TODO Auto-generated method stub
		return ticketDAO.findById(id);
	}

	@Override
	public void addTicket(Ticket newTicket) {
		// TODO Auto-generated method stub
		ticketDAO.add(newTicket);
	}

	@Override
	public void updateTicket(Ticket newTicket) throws Exception {
		// TODO Auto-generated method stub
		ticketDAO.update(newTicket);
		
	}

	@Override
	public void addEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		employeeDAO.update(newEmployee);
		
	}

}
