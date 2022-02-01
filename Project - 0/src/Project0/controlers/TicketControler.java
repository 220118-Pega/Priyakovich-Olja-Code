package Project0.controlers;

import Models.Ticket;
import bl.ITicketBl;
import io.javalin.http.Handler;

public class TicketControler implements IController {

	private ITicketBl ticketbl;
	
	public TicketController (ITicketBl ticketbl) {
		this.ticketbl = ticketbl;
	}
	
	
	@Override
	public Handler getAll() {
		// TODO Auto-generated method stub
		return ctx -> {
			ctx.jsonStream(ticketbl.getTicket());
		};
	}

	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return ctx -> {
			String id = ctx.pathParam("ticket_id");
			int actualId = Integer.parseInt(id);
			ctx.jsonStream(ticketbl.getTicketByEmployeeId(actualId));
		};
	}

	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		return ctx -> {
			Ticket newTicket = ctx.bodyAsClass(Ticket.class);
			try {
				ticketbl.addTicket(newTicket);
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
		return null;
	}
	

}
