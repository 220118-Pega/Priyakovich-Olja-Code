package bl;
import java.util.ArrayList;
import Models.Employee;
import Models.Ticket;

public interface IEmployeeBL {
	void addEmployee (Employee employee);
	void updateEmployee(Employee employee) throws Exception;
	Ticket getTicketById(int ticketId) throws Exception;
	void addTicket(Ticket newTicket);
	ArrayList<Ticket> getTickets();
	void updateTicket(Ticket bodyStreamAsClass) throws Exception;
}
