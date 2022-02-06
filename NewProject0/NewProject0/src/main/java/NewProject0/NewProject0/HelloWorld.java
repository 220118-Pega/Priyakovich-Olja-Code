
package NewProject0.NewProject0;

import Models.Ticket;
import NewProject0.storage.TicketDAO;
import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
//    Javalin app = Javalin.create().start(7000);
//    app.get("/", ctx -> ctx.result("Hello World"));
    
    TicketDAO ticketDAO = new TicketDAO();
    for(Ticket ticket:ticketDAO.getAllTickets()) {
    	System.out.println(ticket);
    }
  }
}


