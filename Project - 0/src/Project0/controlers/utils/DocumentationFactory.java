package Project0.controlers.utils;

import Models.Employee;
import Models.Ticket;
import io.javalin.plugin.openapi.dsl.OpenApiBuilder;
import io.javalin.plugin.openapi.dsl.OpenApiDocumentation;

public class DocumentationFactory {
	
	
	public static OpenApiDocumentation getDoc(String endPoint)
	{
		switch (endPoint)
		{
		case "getTicket":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Ticket");
			}).jsonArray("200", Ticket.class);
		case "getTicketById":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Ticket");
			}).json("200", Ticket.class);
		case "addTicket":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Ticket");
			}).body(Ticket.class).result("201");
		case "addEmployee":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Employee");
			}).body(Employee.class).result("201");
		case "updateEmployee":
			return OpenApiBuilder.document().operation(op -> 
			{
				op.addTagsItem("Employee");
			}).queryParam("upvote", Integer.class).result("204");
		case "getEmployee":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Employee");
			}).json("200", Employee.class);
		default:
			return null;
		}
	}
	
}