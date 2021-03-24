import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Info;
import util.UtilDB;

@WebServlet("/RecipeInsert")
public class RecipeInsert extends HttpServlet implements Info {
   private static final long serialVersionUID = 1L;

   public RecipeInsert() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String recipename = request.getParameter("recipename").trim();
      String recipedesc = request.getParameter("recipedesc").trim();
      String image = request.getParameter("image").trim();
      String amount1 = request.getParameter("amount1").trim();
      String ingredient1 = request.getParameter("ingredient1").trim();
      String prep1 = request.getParameter("prep1").trim();
      String amount2 = request.getParameter("amount2").trim();
      String ingredient2 = request.getParameter("ingredient2");
      String prep2 = request.getParameter("prep2").trim();
      String amount3= request.getParameter("amount3").trim();
      String ingredient3 = request.getParameter("ingredient3");
      String prep3 = request.getParameter("prep3").trim();
      String amount4 = request.getParameter("amount4").trim();;
      String ingredient4 = request.getParameter("ingredient4");
      String prep4 = request.getParameter("prep4").trim();
      String amount5 = request.getParameter("amount5").trim();
      String ingredient5 = request.getParameter("ingredient5");
      String prep5 = request.getParameter("prep5").trim();
      String amount6 = request.getParameter("amount6").trim();
      String ingredient6= request.getParameter("ingredient6");
      String prep6= request.getParameter("prep6").trim();
      String amount7 = request.getParameter("amount7").trim();
      String ingredient7 = request.getParameter("ingredient7");
      String prep7= request.getParameter("prep7").trim();
      String amount8 = request.getParameter("amount8").trim();
      String ingredient8 = request.getParameter("ingredient8");
      String prep8 = request.getParameter("prep8").trim();
      String amount9 = request.getParameter("amount9").trim();
      String ingredient9= request.getParameter("ingredient9");
      String prep9= request.getParameter("prep9").trim();
      String amount10 = request.getParameter("amount10").trim();
      String ingredient10 = request.getParameter("ingredient10");
      String prep10= request.getParameter("prep10").trim();
      String amount11 = request.getParameter("amount11").trim();
      String ingredient11 = request.getParameter("ingredient11");
      String prep11 = request.getParameter("prep11").trim();
      String amount12 = request.getParameter("amount12").trim();
      String ingredient12= request.getParameter("ingredient12");
      String prep12 = request.getParameter("prep12").trim();
      String amount13 = request.getParameter("amount13").trim();;
      String ingredient13 = request.getParameter("ingredient13");
      String prep13 = request.getParameter("prep13").trim();
      String amount14 = request.getParameter("amount14").trim();
      String ingredient14= request.getParameter("ingredient14");
      String prep14 = request.getParameter("prep14").trim();
      String amount15 = request.getParameter("amount15").trim();
      String ingredient15 = request.getParameter("ingredient15");
      String prep15 = request.getParameter("prep15").trim();
      String Instruction1 = request.getParameter("Instruction1").trim();
      String Instruction2 = request.getParameter("Instruction2").trim();
      String Instruction3 = request.getParameter("Instruction3").trim();
      String Instruction4 = request.getParameter("Instruction4").trim();
      String Instruction5 = request.getParameter("Instruction5").trim();
      String Instruction6 = request.getParameter("Instruction6").trim();
      String Instruction7 = request.getParameter("Instruction7").trim();
      String Instruction8 = request.getParameter("Instruction8").trim();
      String Instruction9 = request.getParameter("Instruction9").trim();
      String Instruction10 = request.getParameter("Instruction10").trim();
      String Instruction11 = request.getParameter("Instruction11").trim();
      String Instruction12 = request.getParameter("Instruction12").trim();
      String Instruction13 = request.getParameter("Instruction13").trim();
      String Instruction14 = request.getParameter("Instruction14").trim();
      String Instruction15 = request.getParameter("Instruction15").trim();
      
      UtilDB.createRecipes(recipename, recipedesc, image,
      		amount1, ingredient1, prep1, 
      		 amount2, ingredient2, prep2, 
      		 amount3, ingredient3, prep3, 
      		 amount4, ingredient4, prep4, 
      		 amount5, ingredient5, prep5, 
      		 amount6, ingredient6, prep6, 
      		 amount7, ingredient7, prep7, 
      		 amount8, ingredient8, prep8, 
      		 amount9, ingredient9, prep9, 
      		 amount10, ingredient10, prep10, 
      		 amount11, ingredient11, prep11, 
      		 amount12, ingredient12, prep12, 
      		 amount13, ingredient13, prep13, 
      		 amount14, ingredient14, prep14,
  		     amount15, ingredient15, prep15,
  		     Instruction1, Instruction2, Instruction3, Instruction4, Instruction5,
  		     Instruction6, Instruction7, Instruction8, Instruction9, Instruction10,
  		     Instruction11, Instruction12, Instruction13, Instruction14, Instruction15 );

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Database Information Inserted";
      String docType = "<!doctype html\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h1 align=\"center\">" + title + "</h1>\n");
      out.println("<ul>");
      out.println("Recipe Name: " + recipename);
      out.println("" + recipedesc);
      out.println("<img src=\"" +image+ "\" alt=\"" +image+ "\" style=\"width:60%\">" );
      out.println("<li> " + amount1 + " " + ingredient1 + " " + prep1);
      out.println("</ul>");
      out.println("<a href=/" + projectName + "/" + searchWebName + ">Search Data</a> <br>");
      out.println("</body></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
