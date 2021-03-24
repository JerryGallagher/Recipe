import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Recipe;
import util.UtilDB;
import util.UtilFile;

/**
 * Servlet implementation class MyServletHibernate0309Gallagher
 */
@WebServlet("/RecipeListFromDB")
public class RecipeUploadfromCSVtoDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeUploadfromCSVtoDB() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
	      String filename = "/WEB-INF/input.csv";
	      List<String> contents = UtilFile.readFile(getServletContext(), filename);
	      
	      PrintWriter out = response.getWriter();
	      
			      
	      for (String iLine : contents) {
		         System.out.println(iLine);
		         StringTokenizer st1 = new StringTokenizer(iLine,","); 
		         String recipename=(st1.nextToken()); //very bad and trusting
		         String recipedesc=(st1.nextToken());
		         String image=(st1.nextToken());
		         String amount1=(st1.nextToken()); 
		         String ingredient1=(st1.nextToken());
		         String prep1=(st1.nextToken());
		         String amount2=(st1.nextToken());
		         String ingredient2=(st1.nextToken());
		         String prep2=(st1.nextToken());
		         String amount3=(st1.nextToken());
		         String ingredient3=(st1.nextToken());
		         String prep3=(st1.nextToken());
		         String amount4=(st1.nextToken());
		         String ingredient4=(st1.nextToken());
		         String prep4=(st1.nextToken());
				 String amount5=(st1.nextToken());
				 String ingredient5=(st1.nextToken());
				 String prep5=(st1.nextToken());
				 String amount6=(st1.nextToken());
				 String ingredient6=(st1.nextToken());
				 String prep6=(st1.nextToken()); 
				 String amount7=(st1.nextToken());
				 String ingredient7=(st1.nextToken());
				 String prep7=(st1.nextToken());
				 String amount8=(st1.nextToken());
				 String ingredient8=(st1.nextToken());
				 String prep8=(st1.nextToken());
				 String amount9=(st1.nextToken());
				 String ingredient9=(st1.nextToken());
				 String prep9=(st1.nextToken());
				 String amount10=(st1.nextToken());
				 String ingredient10=(st1.nextToken());
				 String prep10=(st1.nextToken());
				 String amount11=(st1.nextToken());
				 String ingredient11=(st1.nextToken());
				 String prep11=(st1.nextToken());
				 String amount12=(st1.nextToken());
				 String ingredient12=(st1.nextToken());
				 String prep12=(st1.nextToken());
				 String amount13=(st1.nextToken());
				 String ingredient13=(st1.nextToken());
				 String prep13=(st1.nextToken());
				 String amount14=(st1.nextToken());
				 String ingredient14=(st1.nextToken());
				 String prep14=(st1.nextToken());
				 String amount15=(st1.nextToken());
				 String ingredient15=(st1.nextToken());
				 String prep15=(st1.nextToken());
				 String Instruction1=(st1.nextToken());
				 String Instruction2=(st1.nextToken());
				 String Instruction3=(st1.nextToken());
				 String Instruction4=(st1.nextToken());
				 String Instruction5=(st1.nextToken());
				 String Instruction6=(st1.nextToken());
				 String Instruction7=(st1.nextToken());
				 String Instruction8=(st1.nextToken());
				 String Instruction9=(st1.nextToken());
				 String Instruction10=(st1.nextToken());
				 String Instruction11=(st1.nextToken());
				 String Instruction12=(st1.nextToken());
				 String Instruction13=(st1.nextToken());
				 String Instruction14=(st1.nextToken());
				 String Instruction15=(st1.nextToken());
				 
	        	        
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
	        	       	        
	      }
	      String title = "Database Result";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + //
	              "transitional//en\">\n"; //
	        out.println(docType + //
	              "<html>\n" + //
	              "<head><title>" + title + "</title></head>\n" + //
	              "<body bgcolor=\"#f0f0f0\">\n" + //
	              "<h1 align=\"center\">" + title + "</h1>\n");
	     
	        List<Recipe> listRecipes = UtilDB.listRecipes();
	      for (Recipe recipe : listRecipes) {
	    	  out.println("<li>" + recipe.getId() + ", " //
	               + recipe.getRecipeName() + ", " //
	               + recipe.getRecipeDesc() + "," //
	               + recipe.getImage() + ","  //
	               + recipe.getAmount1() + ", " //
	               + recipe.getIngredient1() + ", " //
	               + recipe.getPrep1() + "</li>");
	      }
	  
	      out.println("</body></html>");
	      
	   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
