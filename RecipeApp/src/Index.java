

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
      header(out);
 
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
