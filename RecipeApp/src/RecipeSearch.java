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
      try {
          header(out);
      
    
          out.println("<ul>");

      List<Recipe> listRecipes = null;
      if (keyword != null && !keyword.isEmpty()) {
         listRecipes = UtilDB.listRecipes(keyword);
      } else {
         listRecipes = UtilDB.listRecipes();
      }
      display(listRecipes, out);
      
      
      footer(out);
      
   } finally {
      out.close();  //close the output writer
   }
      
      
   }//end of doGet

   void display(List<Recipe> listRecipes, PrintWriter out) {
      for (Recipe recipe : listRecipes) {
         System.out.println("[DBG] " + recipe.getId() + ", " //
        		   + recipe.getAmount1() + ", " //
	               + recipe.getIngredient1() + ", " //
	               + recipe.getPrep1());

         out.println("<li>" + recipe.getId() + ", " //
        		 +"<a href=/" + projectName + "/" + displayWebname + "?id=" +recipe.getId() + ">"
                 +recipe.getRecipeName()+ "</a> " + "</h3>"  //("<a href=/" + projectName + "/" + searchWebName + ">Search Data</a> <br>"); //
	               + recipe.getAmount1() + ", " //
	               + recipe.getIngredient1() + ", " //
	               + recipe.getPrep1() + "</li>");
         
    
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
