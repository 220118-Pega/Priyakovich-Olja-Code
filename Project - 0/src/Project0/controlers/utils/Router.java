package Project0.controlers.utils;

import Project0.controlers.IController;
import io.javalin.Javalin;
import io.javalin.plugin.openapi.dsl.OpenApiBuilder;

public class Router {
	private Javalin app;
	private IController tController;
	public Router(Javalin app, IController tController)
	
	{
		this.app = app;
		this.tController = tController; 
	}
	
	public void setUpEndPoints() {
	
		app.get("/Ticket", OpenApiBuilder.documented(DocumentationFactory.getDoc("getTicket"), tController.getAll()));
		app.get("/Ticket/{ticket_id}/employee", OpenApiBuilder.documented(DocumentationFactory.getDoc("getTicketById"),tController.getById()));
		app.post("/Ticket",  OpenApiBuilder.documented(DocumentationFactory.getDoc("addTicket"), tController.add()));
//		app.post("/Employee", OpenApiBuilder.documented(DocumentationFactory.getDoc("addEmployee"), EmployeeController.add()));
		app.put("/Ticket", OpenApiBuilder.documented(DocumentationFactory.getDoc("updateTicket"), tController.update()));
//		app.get("/Employee/{employee_id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("getEmployee"), EmployeeController.getById()));
	
	}
}
