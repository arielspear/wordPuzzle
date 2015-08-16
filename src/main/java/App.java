    import java.io.Console;
    import java.util.HashMap;
    import spark.ModelAndView;
    import spark.template.velocity.VelocityTemplateEngine;
    import static spark.Spark.*;

    public class App {

      Console myConsole = System.console();
      public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/results", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/results.vtl");

          String userInput = request.queryParams("input");
          String removeVowels = removeVowels(userInput);

          model.put("removeVowels", removeVowels);
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
      }

      public static String removeVowels(String input) {

        String result = input.replaceAll("[aeiouAEIOU]", "-");

        return result;
      }
    }
