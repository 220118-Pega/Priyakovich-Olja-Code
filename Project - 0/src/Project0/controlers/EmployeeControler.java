package Project0.controlers;

import Models.Employee;
import bl.ITicketBl;
import bl.TicketBL;
import io.javalin.http.Handler;

public class EmployeeControler implements IController {
	private ITicketBl ticketBL;
	
	public EmployeeControler (ITicketBl ticketbl); 
	{
		this.ticketBL = ticketBL;
	}
	
	
	@Override
	public Handler getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return ctx -> {
			ctx.jsonStream(ticketBL.getEmployeeById(Integer.parseInt(ctx.pathParam("employee_id"))));
		};
	}

	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		return ctx -> {
			TicketBL.addEmployee(ctx.bodyStreamAsClass(Employee.class));
		};
	}

	@Override
	public Handler update() {
		// TODO Auto-generated method stub
		return ctx -> {
			Integer newUpVote = Integer.parseInt(ctx.queryParam("upvote"));
			Integer employeeId = Integer.parseInt(ctx.pathParam("employee_id"));
			TicketBL.updateSolution(employeeId, newUpVote);
			ctx.status(204);
		};
	}

}
