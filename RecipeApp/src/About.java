

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

/**
 * Servlet implementation class About
 */
@WebServlet("/About")
public class About extends HttpServlet implements Info {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public About() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
	      PrintWriter out = response.getWriter();
	      try {
	          header(out);
	          
	          display(out);
	     
	          footer(out);
	          
	       } finally {
	          out.close();  //close the output writer
	       }
	}//end of doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	 void display( PrintWriter out) {
		 out.println("<div class=\"w3-main w3-content w3-padding\" style=\"max-width:1200px;margin-top:100px\">");
		 out.println("<div class=\"w3-container w3-padding-32 w3-center\">");
		 out.println("<h3>About Me, I like to cook</h3><br>");
		 out.println("<img src=\"Images/Chef.jpg\" alt=\"Me\" class=\"w3-image\" style=\"display:block;margin:auto\" width=\"800\" height=\"533\">");
		 out.println("<div class=\"w3-padding-32\">");    
		 out.println("<h4><b>I am a foodie who has eaten all over the world, and likes to try new things. This is a collection of recipes that I have tried at home and personally endorse.</b></h4>" );
		 out.println("<h6><i>I may not make them excately as advertised but who has time to write it down?</i></h6>"); 
		 out.println("<p> Just the love of the food and the flavors. Mostly vegetarian. Feel free to add meat. The more you love the more you know, the more you know the more you love </p>");            
		     out.println("</div> ");
		     out.println("</div> ");
		
	 }
	 
}//end of About
