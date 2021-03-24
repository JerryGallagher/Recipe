package util;

import java.io.PrintWriter;

public interface Info {
   public String projectName = "RecipeApp";
   public String searchWebName = "SimpleRecipeSearch.html";
   public String insertWebName = "RecipeInsert.html";
   public String displayWebname = "RecipeDisplay";
   public String homeWebName = "Index";
   public String aboutWebName ="About";
   
   public default void header (PrintWriter out) {
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
   out.println("<nav class=\"w3-sidebar w3-bar-block w3-card w3-top w3-xlarge w3-animate-left\" style=\"display:none;z-index:2;width:25%;min-width:300px\" id=\"mySidebar\">");  
   out.println("<a href=\"javascript:void(0)\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button\">Close Menu</a>");  
   out.println("<a href=/" + projectName + "/" + homeWebName + " onclick=\"w3_close()\" class=\"w3-bar-item w3-button\">Food</a>");  
   out.println("<a href=/" + projectName + "/" + aboutWebName + " onclick=\"w3_close()\" class=\"w3-bar-item w3-button\">About</a>");  
   out.println("</nav>");
   out.println("<div class=\"w3-top\">");
   out.println("<div class=\"w3-white w3-xlarge\" style=\"max-width:1200px;margin:auto\">");
   out.println("<div class=\"w3-button w3-padding-16 w3-left\" onclick=\"w3_open()\"><img src=Images/menu.jpg alt=menu style=\"width:30px\"></div>");
   //"<img src=\""+recipe.getImage()+"\" alt=\""+recipe.getImage()+"\" style=\"width:100%\">"
   out.println("<div class=\"w3-right w3-padding-16\"><a href=/" + projectName + "/" + searchWebName + ">Search</a></div>");
   out.println("<div class=\"w3-center w3-padding-16\"><a href=\"/RecipeApp/Index\">Recipes</a></div>");
   out.println("</div>");  
   out.println("</div>");  
   
   out.println("<div class=\"w3-main w3-content w3-padding\" style=\"max-width:1200px;margin-top:100px\">");
   }//end of header
   
   
   
   
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
