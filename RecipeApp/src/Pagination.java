

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
 
/**
 * Servlet implementation class Pagination
 */
@WebServlet("/Pagination")
public class Pagination extends HttpServlet {
	private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            int pageid;
            if (request.getParameter("page")!= null)
            {String spageid=request.getParameter("page");
            pageid=Integer.parseInt(spageid); 
            }
            else
            {
            pageid=1;
            }
            //int startRecord;
            int pageSize=8;  
            if(pageid==1){}  
            else{  
                pageid=pageid-1;  
                pageid=pageid*pageSize+1;  
            }  
            //List<Emp> list=EmpDao.getRecords(pageid,pageSize);
            List<Recipe> listRecipes = UtilDB.listRecipes(pageid,pageSize);
      
            int iterator_for_end_div=0;
            for (Recipe recipe : listRecipes)
             {
          	  out.println("<div class=\"w3-quarter\">" //
                     + "<img src=\""+recipe.getImage()+"\" alt=\""+recipe.getImage()+"\" style=\"width:100%\">" //
                     + "<h3>"+recipe.getRecipeName()+"</h3>" //
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
            out.println("<a href=\"?page="+(pageid-1 > 1 ? pageid -1 : 1 )  + "\" class=\"w3-bar-item w3-button w3-hover-black\">«</a>");
            long noOfPages=UtilDB.countRecipesPages(pageSize);
            for(long i=1;i<=noOfPages;i++)
            {
            out.println("<a href=\"?page="+i+"\" class=\"w3-bar-item w3-button w3-hover-black\">"+i+"</a>");
            }
            out.println("<a href=\"?page="+(pageid+1 < noOfPages ? pageid+1 : noOfPages)  + "\" class=\"w3-bar-item w3-button w3-hover-black\">»</a>");
            out.println("</div>");  
            
              
              
            out.close();  
        }  
      
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pagination() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
