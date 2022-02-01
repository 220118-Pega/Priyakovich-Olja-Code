package Project0.controlers.utils;

import Project0.controlers.IController;
import io.javalin.Javalin;

public class Router {
	private Javalin app;
	private IController TicketController;
	private IController EmployeeController;
	public Router(Javalin app, IController TicketController, IController solutionController)
	
	{
		this.app = app;
		this.TicketController = TicketController;
		this.EmployeeController = EmployeeController; 
	}
	
	public void setUpEndPoints() {
		app.get("/Ticket", OpenApiBuilder.documented(DocumentationFactory.getDoc("getTicket"), TicketController.getAll()));
		app.get("/Iicket/{ticket_id}/employee", OpenApiBuilder.documented(DocumentationFactory.getDoc("getTicketById"), TicketController.getById()));
		app.post("/Ticket",  OpenApiBuilder.documented(DocumentationFactory.getDoc("addTicket"), TicketController.add()));
		app.post("/Employee", OpenApiBuilder.documented(DocumentationFactory.getDoc("addEmployee"), solutionController.add()));
		app.put("/Employee/{employee_id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("updateEmployee"), EmployeeController.update()));
		app.get("/Employee/{employee_id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("getEmployee"), EmployeeController.getById()));
	}
	}
}
