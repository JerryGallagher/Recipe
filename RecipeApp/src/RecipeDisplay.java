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
          out.println("<!DOCTYPE html>");
          out.println("<html><head>");
          out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
          out.println("<title>RecipeApp</title></head>");
          out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
          out.println("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">");
          out.println("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Karma\">");
          out.println("<style>");
          out.println("body,h1,h2,h3,h4,h5,h6 {font-family: \"Karma\", sans-serif}");
          out.println(".w3-bar-block .w3-bar-item {padding:20px}");
          out.println("</style>");
          out.println("<body>");
          out.println("<nav class=\"w3-sidebar w3-bar-block w3-card w3-top w3-xlarge w3-animate-left\" style=\"display:none;z-index:2;width:40%;min-width:300px\" id=\"mySidebar\">");  
          out.println("<a href=\"javascript:void(0)\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button\">Close Menu</a>");  
          out.println("<a href=\"/RecipeApp\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button\">Food</a>");  
          out.println("<a href=" + projectName + "/About\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button\">About</a>");  
          out.println("</nav>");
          out.println("<div class=\"w3-top\">");
          out.println("<div class=\"w3-white w3-xlarge\" style=\"max-width:1200px;margin:auto\">");
          out.println("<div class=\"w3-button w3-padding-16 w3-left\" onclick=\"w3_open()\">=</div>");
          out.println("<div class=\"w3-right w3-padding-16\"><a href=" + projectName + "/" + searchWebName + "\">Search</a></div>");
          out.println("<div class=\"w3-center w3-padding-16\"><a href=\"/RecipeApp/Index\">Recipes</a></div>");
          out.println("</div>");  
          out.println("</div>");  
          
          out.println("<div class=\"w3-main w3-content w3-padding\" style=\"max-width:1200px;margin-top:100px\">");
            


      List<Recipe> listRecipes = null;
      if (id != null && id != 0) {
         listRecipes = UtilDB.listRecipes(id);
      } else {
    	  response.sendRedirect("/" + projectName + "/" + homeWebname );
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
         out.println("<p>" + recipe.getInstruction15() + ", "+recipe.getInstruction13() + ", "+recipe.getInstruction14() + "</p>");        
         out.println("</div> ");      
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
