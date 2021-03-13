import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Recipe;
import util.Info;
import util.UtilDB;

@WebServlet("/RecipeSearch")
public class RecipeSearch extends HttpServlet implements Info {
   private static final long serialVersionUID = 1L;

   public RecipeSearch() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String keyword = request.getParameter("keyword").trim();

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Database Result";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h1 align=\"center\">" + title + "</h1>\n");
      out.println("<ul>");

      List<Recipe> listRecipes = null;
      if (keyword != null && !keyword.isEmpty()) {
         listRecipes = UtilDB.listRecipes(keyword);
      } else {
         listRecipes = UtilDB.listRecipes();
      }
      display(listRecipes, out);
      out.println("</ul>");
      out.println("<a href=/" + projectName + "/" + searchWebName + ">Search Data</a> <br>");
      out.println("</body></html>");
   }

   void display(List<Recipe> listRecipes, PrintWriter out) {
      for (Recipe recipe : listRecipes) {
         System.out.println("[DBG] " + recipe.getId() + ", " //
        		   + recipe.getAmount1() + ", " //
	               + recipe.getIngredient1() + ", " //
	               + recipe.getPrep1());

         out.println("<li>" + recipe.getId() + ", " //
	               + recipe.getRecipeName() + ", " //
	               + recipe.getAmount1() + ", " //
	               + recipe.getIngredient1() + ", " //
	               + recipe.getPrep1() + "</li>");
         
    
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
