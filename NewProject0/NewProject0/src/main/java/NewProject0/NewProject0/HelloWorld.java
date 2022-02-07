package NewProject0.NewProject0;


import Models.Ticket;
import NewProject0.storage.TicketDAO;
import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
	TicketDAO ticketDAO = new TicketDAO();
    Javalin app = Javalin.create().start(7000);
    app.get("/", ctx -> ctx.result("Hello World"));
    app.get("/tickets", ctx -> ctx.jsonStream(ticketDAO.getAllTickets()));
    app.get("/tickets/{ticket_id}", ctx -> {
    	String stringId = ctx.pathParam("ticket_id");
    	int id = Integer.parseInt(stringId);
    	Ticket ticketById = ticketDAO.getTicketById(id);
    	ctx.json(ticketById);
    		
    });
    app.post("/tickets", ctx -> ticketDAO.addTicket(ctx.bodyStreamAsClass(Ticket.class)));
    
  }
}


