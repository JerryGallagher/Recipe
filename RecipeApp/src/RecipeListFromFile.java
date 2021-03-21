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
	      String docType = "<!DOCTYPE html>";
	      out.println(docType + //
	              "<html>\n" + //
	              "<head><title>" + title + "</title></head>\n" + //
	              "<body bgcolor=\"#f0f0f0\">\n" + //
	              "<h1 align=\"center\">" + title + "</h1>\n");
	        out.println("<div class=\"w3-main w3-content w3-padding\" style=\"max-width:1200px;margin-top:100px\">");
	        out.println("<!-- First Photo Grid-->");
	        out.println("<div class=\"w3-row-padding w3-padding-16 w3-center\" id=\"food\">");
	        int iterator_for_end_div=0;
	      for (String iLine : contents) {
	         System.out.println(iLine);
	         StringTokenizer st1 = new StringTokenizer(iLine,","); 
	         String RecipeName=(st1.nextToken()); //very bad and trusting
	         String RecipeDesc=(st1.nextToken());
	         String Image=(st1.nextToken());
	         String Amount1=(st1.nextToken()); 
	         String Ingredient1=(st1.nextToken());
	         String Prep1=(st1.nextToken());
	        	        
	        //out.println(RecipeName + ", " + RecipeDesc + ", " +  Amount1 + ", " + Ingredient1 + ", " + Prep1 + "<br>" );
	        //out.println("<img src=\""+Image+"\" alt=\""+Image+"\" style=\"width:100%\">");
	        out.println("<div class=\"w3-quarter\">" //
	                + "<img src=\""+Image+"\" alt=\""+Image+"\" style=\"width:100%\">" //
	                + "<h3>"+RecipeName+"</h3>" //
	                + "<p>"+RecipeDesc + "</p>" //
	                + "</div>");
	     	  iterator_for_end_div++;
	     	  if (iterator_for_end_div%4==0)
	     			  { out.println("</div> "); 
	     			  out.println("<div class=\"w3-row-padding w3-padding-16 w3-center\">" ); }
	      }
	      out.println("</div>");
	      out.println("</div>");
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