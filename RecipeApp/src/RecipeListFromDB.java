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
public class RecipeListFromDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeListFromDB() {
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
	        	        
	        UtilDB.createRecipes(recipename, recipedesc, image, amount1, ingredient1, prep1);
	        	       	        
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
