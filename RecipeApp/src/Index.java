

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Recipe;
import util.UtilDB;
import util.Info;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet implements Info{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
   // Set the response message's MIME type
   response.setContentType("text/html;charset=UTF-8");
   // Allocate a output writer to write the response message into the network socket
   PrintWriter out = response.getWriter();

   int pageid;
   if (request.getParameter("page")!= null)
   {String spageid=request.getParameter("page");
   pageid=Integer.parseInt(spageid); 
   }
   else
   {
   pageid=1;
   }
   int pageSize=8;  
   if(pageid==1){}  
   else{  
       pageid=pageid-1;  
       pageid=pageid*pageSize+1;  
   } 
   
   // Write the response message, in an HTML page
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
      out.println("<a href=\"#food\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button\">Food</a>");  
      out.println("<a href=\"/RecipeApp/About\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button\">About</a>");  
      out.println("</nav>");
      out.println("<div class=\"w3-top\">");
      out.println("<div class=\"w3-white w3-xlarge\" style=\"max-width:1200px;margin:auto\">");
      out.println("<div class=\"w3-button w3-padding-16 w3-left\" onclick=\"w3_open()\">=</div>");
      out.println("<div class=\"w3-right w3-padding-16\"><a href=\"/RecipeApp/SimpleRecipeSearch.html\">Search</a></div>");
      out.println("<div class=\"w3-center w3-padding-16\">My Recipes</div>");
      out.println("</div>");  
      out.println("</div>");  
      
      out.println("<div class=\"w3-main w3-content w3-padding\" style=\"max-width:1200px;margin-top:100px\">");
 
      out.println("<!-- First Photo Grid-->");
      out.println("<div class=\"w3-row-padding w3-padding-16 w3-center\" id=\"food\">");
      List<Recipe> listRecipes = UtilDB.listRecipes(pageid-1,pageSize);
      int iterator_for_end_div=0;
      for (Recipe recipe : listRecipes)
       {
    	  out.println("<div class=\"w3-quarter\">" //
               + "<img src=\""+recipe.getImage()+"\" alt=\""+recipe.getImage()+"\" style=\"width:100%\">" //
               + "<h3>"
               +"<a href=/" + projectName + "/" + displayWebname + "?id=" +recipe.getId() + ">"
               +recipe.getRecipeName()+ "</a> " + "</h3>"  //("<a href=/" + projectName + "/" + searchWebName + ">Search Data</a> <br>");
               + "<p>"+ recipe.getRecipeDesc() + "</p>" //
               + "</div>");
    	  iterator_for_end_div++;
    	  if (iterator_for_end_div%4==0)
    			  { out.println("</div> "); 
    			  out.println("<div class=\"w3-row-padding w3-padding-16 w3-center\">" ); }
      }
     
      out.println("</div>");
         
      out.println("<!-- Pagination -->");
      out.println("<div class=\"w3-center w3-padding-32\">");
      out.println("<div class=\"w3-bar\">");
      if (request.getParameter("page")!= null)
      {String spageid=request.getParameter("page");
      pageid=Integer.parseInt(spageid); 
      }
      else
      {
      pageid=1;
      }
      out.println("<a href=\"?page="+(pageid-1 > 1 ? pageid -1 : 1 )  + "\" class=\"w3-bar-item w3-button w3-hover-black\">�</a>");
      long noOfPages=UtilDB.countRecipesPages(pageSize);
      for(long i=1;i<=noOfPages;i++)
      {
      out.println("<a href=\"?page="+i+"\" class=\"w3-bar-item w3-button w3-hover-black\">"+i+"</a>");
      }
      out.println("<a href=\"?page="+(pageid+1 < noOfPages ? pageid+1 : noOfPages)  + "\" class=\"w3-bar-item w3-button w3-hover-black\">�</a>");
      out.println("</div>"); 
      
      footer(out);

   } finally {
      out.close();  //close the output writer
   }
}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
