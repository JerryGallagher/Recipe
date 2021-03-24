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

@WebServlet("/RecipeDisplay")
public class RecipeDisplay extends HttpServlet implements Info {
   private static final long serialVersionUID = 1L;

   public RecipeDisplay() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   Integer id;
	   if (request.getParameter("id")!= null)
       {String sid=request.getParameter("id");
       id = Integer.parseInt(sid);
       }
       else
       {
       id = 0;
       }
	   
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>Recipe</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" ); //
            


      List<Recipe> listRecipes = null;
      if (id != null && id != 0) {
         listRecipes = UtilDB.listRecipes(id);
      } else {
    	  response.sendRedirect("/" + projectName + "/" + homeWebname );
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

         out.println("<p>" + recipe.getId() + ", " //
        		 + "<h1 align=\"center\">" + recipe.getRecipeName() + "</h1>\n" //
	               + recipe.getAmount1() + ", " //
	               + recipe.getIngredient1() + ", " //
	               + recipe.getPrep1() );
         
    
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
