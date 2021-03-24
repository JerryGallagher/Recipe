package util;

import java.io.PrintWriter;

public interface Info {
   public String projectName = "RecipeApp";
   public String searchWebName = "SimpleRecipeSearch.html";
   public String insertWebName = "RecipeInsert.html";
   public String displayWebname = "RecipeDisplay";
   public String homeWebname = "Index";
   
   public default void footer (PrintWriter out) {
	      out.println("</body></html>");
	      out.println(" <!-- Footer -->");
	      out.println("<footer class=\"w3-row-padding w3-padding-32\">");
	      out.println("<div class=\"w3-third\">");
	      out.println("<h3>FOOTER</h3>");
	      out.println("<p>A simple recipe display site.</p>");
	      out.println("<p>Parts Borrowed from <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\">w3.css</a></p>");
	      out.println("</div>");
	      out.println("</footer>");
	      out.println("</div>");
	           
	      out.println("<script>");
	      out.println("function w3_open() {");
	      out.println("document.getElementById(\"mySidebar\").style.display = \"block\";}");
	      out.println("function w3_close() {");
	      out.println("document.getElementById(\"mySidebar\").style.display = \"none\";}");
	      out.println(" </script>");
	      out.println("</body>");
	      out.println("</html>");
   }//end of footer
}
