package Project0.controlers.utils;

import Project0.controlers.IController;
import io.javalin.Javalin;
import io.javalin.plugin.openapi.dsl.OpenApiBuilder;

public class Router {
	private Javalin app;
	private IController TicketController;
	private IController EmployeeController;
	public Router(Javalin app, IController employeeController, IController ticketController)
	
	{
		this.app = app;
		this.EmployeeController = employeeController;
		this.TicketController = ticketController; 
	}
	
	public void setUpEndPoints() {
		
		app.get("/Ticket", OpenApiBuilder.documented(DocumentationFactory.getDoc("getTicket"), TicketController.getAll()));
		app.get("/Ticket/{ticket_id}/employee", OpenApiBuilder.documented(DocumentationFactory.getDoc("getTicketById"), TicketController.getById()));
		app.post("/Ticket",  OpenApiBuilder.documented(DocumentationFactory.getDoc("addTicket"), TicketController.add()));
		app.post("/Employee", OpenApiBuilder.documented(DocumentationFactory.getDoc("addEmployee"), EmployeeController.add()));
		app.put("/Employee/{employee_id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("updateEmployee"), EmployeeController.update()));
		app.get("/Employee/{employee_id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("getEmployee"), EmployeeController.getById()));
	
	}
}
