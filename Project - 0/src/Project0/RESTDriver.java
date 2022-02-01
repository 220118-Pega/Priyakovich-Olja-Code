package Project0;

import Project0.controlers.EmployeeControler;
import Project0.controlers.IController;
import Project0.controlers.TicketControler;
import Project0.controlers.utils.Router;
import bl.TicketBL;
import dl.DBRepository;
import io.javalin.Javalin;

public class RESTDriver {

	public static void main(String[] args) {
		
		IController ticketControler = new TicketControler(
				new TicketBL(new DBRepository(new TicketDAO(), (new EmployeeDAO())));
		IController employeeController = new EmployeeControler(
				new TicketBL(new DBRepository(new TicketDAO(), (new EmployeeDAO())));
				
		Javalin app = Javalin.create(config -> {
			config.registerPlugin(new OpenApiPlugin(getOpenApiOption()));
		}).start(7000);
		Router router = new Router(app, ticketControler, employeeController);
		router.setUpEndPoints();
	}
	private static OpenApiOptions getOpenApiOptions() {
		Info applicationInfo = new Info().version("1.0").description("Project0 REST");
		return new OpenApiOptions(applicationInfo).path("/swagger-dock")
				.swagger(new SwaggerOption("/swagger").title("Project0 API Docs"));
	
	}
}

