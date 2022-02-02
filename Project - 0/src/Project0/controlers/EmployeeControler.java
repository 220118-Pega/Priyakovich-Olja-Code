package Project0.controlers;

import Models.Employee;
import bl.IEmployeeBL;
import bl.ITicketBl;
import bl.TicketBL;
import io.javalin.http.Handler;

public class EmployeeControler implements IController {
	private IEmployeeBL employeeBL;
	public EmployeeControler (IEmployeeBL employeeBL); 
	{
		this.employeeBL = employeeBL;
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
			ctx.jsonStream(employeeBL.getTicketsById(Integer.parseInt(ctx.pathParam("employee_Id"))));
		};
	}

	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		return ctx -> {
			employeeBL.addEmployee(ctx.bodyStreamAsClass(Employee.class));
		};
	}

	@Override
	public Handler update() {
		// TODO Auto-generated method stub
		return ctx -> {
			Integer newUpVote = Integer.parseInt(ctx.queryParam("upvote"));
			Integer employeeId = Integer.parseInt(ctx.pathParam("employee_id"));
			employeeBL.updateEmployee(employeeId, newUpVote);
			ctx.status(204);
		};
	}

}
