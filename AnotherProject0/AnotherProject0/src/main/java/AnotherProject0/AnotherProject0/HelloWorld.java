
package AnotherProject0.AnotherProject0;

import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
    Javalin app = Javalin.start(7000);
    app.get("/", ctx -> ctx.result("Hello World"));
  }
}
