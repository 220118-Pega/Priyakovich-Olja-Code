package Project0.controlers;

import Models.Ticket;
import bl.ITicketBl;
import io.javalin.http.Handler;

public class TicketControler implements IController {
	
	private ITicketBl ticketBL;
	public TicketControler (ITicketBl ticketBL ) {
		this.ticketBL = ticketBL;
	}
	
	
	@Override
	public Handler getAll() {
		// TODO Auto-generated method stub
		return ctx -> {
			ctx.jsonStream(ticketBL.getTicket());
		};
	}

	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return ctx -> {
			String id = ctx.pathParam("ticket_id");
			int ticketId = Integer.parseInt(id);
			ctx.jsonStream(ticketBL.getTicketById(ticketId));
		};
	}

	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		return ctx -> {
			Ticket newTicket = ctx.bodyAsClass(Ticket.class);
			try {
				ticketBL.addTicket(newTicket);
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
			ticketBL.updateTicket(ctx.bodyStreamAsClass(Ticket.class));
		};
	}
	

}
