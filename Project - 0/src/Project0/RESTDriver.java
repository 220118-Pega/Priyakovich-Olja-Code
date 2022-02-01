package Project0;

import Project0.controlers.EmployeeControler;
import Project0.controlers.IController;
import Project0.controlers.TicketControler;
import Project0.controlers.utils.Router;
import bl.EmployeeBL;
import bl.TicketBL;
import dl.DBRepository;
import dl.EmployeeDAO;
import dl.TicketDAO;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.models.Info;

public class RESTDriver {

	public static void main(String[] args) {
		
		IController ticketControler = new TicketControler(
				new EmployeeBL(new DBRepository(new TicketDAO(), (new EmployeeDAO())));
		IController employeeController = new EmployeeControler(
				new EmployeeBL(new DBRepository(new EmployeeDAO(), new TicketDAO())));
				
		Javalin app = Javalin.create(config -> {
			config.registerPlugin(new OpenApiPlugin(getOpenApiOptions()));
		}).start(7000);
		Router router = new Router(app, ticketControler, employeeController);
		router.setUpEndPoints();
	}
	private static OpenApiOptions getOpenApiOptions() {
		Info applicationInfo = new Info().version("1.0").description("Project0 REST");
		return new OpenApiOptions(applicationInfo).path("/swagger-dock")
				.swagger(new SwaggerOptions("/swagger").title("Project0 API Docs"));
	
	}
}

