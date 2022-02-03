package Project0.controlers;

import Models.Ticket;
import bl.IEmployeeBL;
import bl.ITicketBl;
import bl.TicketBL;
import io.javalin.http.Handler;

public class TicketControler implements IController {
	private IEmployeeBL employeeBL;
	public TicketControler (IEmployeeBL employeeBL ) {
		this.employeeBL = employeeBL;
	}
	
	
	@Override
	public Handler getAll() {
		// TODO Auto-generated method stub
		return ctx -> {
			ctx.jsonStream(employeeBL.getTickets());
		};
	}

	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return ctx -> {
			String id = ctx.pathParam("ticket_id");
			int ticketId = Integer.parseInt(id);
			ctx.jsonStream(employeeBL.getTicketById(ticketId));
		};
	}

	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		return ctx -> {
			Ticket newTicket = ctx.bodyAsClass(Ticket.class);
			try {
				employeeBL.addTicket(newTicket);
				ctx.status(201);
			}catch (Exception e)
			{
				ctx.status(400);
			}
		};
	}

	@Override
	public Handler update() {
		// TODO Auto-generated method stub
		return ctx -> {
			employeeBL.updateTicket(ctx.bodyStreamAsClass(Ticket.class));
		};
	}
	

}
