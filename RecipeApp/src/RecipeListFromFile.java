import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.UtilFile;


/**
 * Servlet implementation class MyServletGallagher
 */
@WebServlet("/RecipeListFromFile")
public class RecipeListFromFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeListFromFile() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
	      String filename = "/WEB-INF/input.csv";
	      List<String> contents = UtilFile.readFile(getServletContext(), filename);
	      
	      PrintWriter out = response.getWriter();
	      
	      String title = "Recipe List From File";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + //
	              "transitional//en\">\n"; //
	        out.println(docType + //
	              "<html>\n" + //
	              "<head><title>" + title + "</title></head>\n" + //
	              "<body bgcolor=\"#f0f0f0\">\n" + //
	              "<h1 align=\"center\">" + title + "</h1>\n");
	        
	      for (String iLine : contents) {
	         System.out.println(iLine);
	         StringTokenizer st1 = new StringTokenizer(iLine,","); 
	         String RecipeName=(st1.nextToken()); //very bad and trusting
	         String Amount1=(st1.nextToken()); 
	         String Ingredient1=(st1.nextToken());
	         String Prep1=(st1.nextToken());
	        	        
	        out.println(RecipeName + ", " + Amount1 + ", " + Ingredient1 + ", " + Prep1 + "<br>" );
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