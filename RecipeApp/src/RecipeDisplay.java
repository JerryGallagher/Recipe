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
	   
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      try {
          
    	  header(out);

      List<Recipe> listRecipes = null;
      if (id != null && id != 0) {
         listRecipes = UtilDB.listRecipes(id);
      } else {
    	  response.sendRedirect("/" + projectName + "/" + homeWebName );
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
         
         out.println("<div class=\"w3-main w3-content w3-padding\" style=\"max-width:1200px;margin-top:100px\">");
         out.println("<h3>" + recipe.getRecipeName()+ "</h3>"); //
         out.println("<p>"+ recipe.getRecipeDesc() + "</p>");
         out.println("<img src=\"" +recipe.getImage()+ "\" alt=\"" +recipe.getImage()+ "\" style=\"width:60%\">" );
         out.println("<p>" + recipe.getAmount1() +" "+ recipe.getIngredient1() +" "+ recipe.getPrep1() + "</p>");
         out.println("<p>" + recipe.getAmount2() +" "+ recipe.getIngredient2() +" "+ recipe.getPrep2() + "</p>");
         out.println("<p>" + recipe.getAmount3() +" "+ recipe.getIngredient3() +" "+ recipe.getPrep1() + "</p>");
         out.println("<p>" + recipe.getAmount4() +" "+ recipe.getIngredient4() +" "+ recipe.getPrep4() + "</p>");
         out.println("<p>" + recipe.getAmount5() +" "+ recipe.getIngredient5() +" "+ recipe.getPrep5() + "</p>");
         out.println("<p>" + recipe.getAmount6() +" "+ recipe.getIngredient6() +" "+ recipe.getPrep6() + "</p>");
         out.println("<p>" + recipe.getAmount7() +" "+ recipe.getIngredient7() +" "+ recipe.getPrep7() + "</p>");
         out.println("<p>" + recipe.getAmount8() +" "+ recipe.getIngredient8() +" "+ recipe.getPrep8() + "</p>");
         out.println("<p>" + recipe.getAmount9() +" "+ recipe.getIngredient9() +" "+ recipe.getPrep9() + "</p>");
         out.println("<p>" + recipe.getAmount10() +" "+ recipe.getIngredient10() +" "+ recipe.getPrep10() + "</p>");
         out.println("<p>" + recipe.getAmount11() +" "+ recipe.getIngredient11() +" "+ recipe.getPrep11() + "</p>");
         out.println("<p>" + recipe.getAmount12() +" "+ recipe.getIngredient12() +" "+ recipe.getPrep12() + "</p>");
         out.println("<p>" + recipe.getAmount13() +" "+ recipe.getIngredient13() +" "+ recipe.getPrep13() + "</p>");
         out.println("<p>" + recipe.getAmount14() +" "+ recipe.getIngredient14() +" "+ recipe.getPrep14() + "</p>");
         out.println("<p>" + recipe.getAmount15() +" "+ recipe.getIngredient15() +" "+ recipe.getPrep15() + "</p>");
         out.println("<p>" + recipe.getInstruction1() + ", "+ recipe.getInstruction2() + ", "+recipe.getInstruction3() + "</p>");
         out.println("<p>" + recipe.getInstruction4() + ", "+ recipe.getInstruction5() + ", "+recipe.getInstruction6() + "</p>");
         out.println("<p>" + recipe.getInstruction7() + ", "+recipe.getInstruction8() + ", "+recipe.getInstruction9() + "</p>");
         out.println("<p>" + recipe.getInstruction10() + ", "+recipe.getInstruction11() + ", "+recipe.getInstruction12() + "</p>");
         out.println("<p>" + recipe.getInstruction13() + ", "+recipe.getInstruction14() + ", "+recipe.getInstruction15() + "</p>");        
         out.println("</div> ");      
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
