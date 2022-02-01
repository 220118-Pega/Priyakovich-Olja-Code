package Project0.controlers;

import io.javalin.http.Handler;

public interface IController {
	Handler getAll();
	Handler getById();
	Handler add();
	Handler update();
}
