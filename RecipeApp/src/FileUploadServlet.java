

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;

/**
 * Servlet implementation class upload
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
maxFileSize = 1024 * 1024 * 5, 
maxRequestSize = 1024 * 1024 * 5 * 5)
@WebServlet("/upload")
public class FileUploadServlet extends HttpServlet {
	
	private final static Logger LOGGER = Logger.getLogger(FileUploadServlet.class.getCanonicalName());
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//get the file chosen by the user
		final Part filePart = request.getPart("fileToUpload");
		final String fileName = getSubmittedFileName(filePart);
		
		//get the InputStream to store the file somewhere
	    InputStream fileInputStream = filePart.getInputStream();
	    
	    //for example, you can copy the uploaded file to the server
	    //note that you probably don't want to do this in real life!
	    //upload it to a file host like S3 or GCS instead
	    for (Part part : request.getParts()) {
	        part.write("D:\\Pictures\\Images" + File.separator + fileName);
	    	//part.write("Images" + File.separator + fileName);
	    }
	    //File fileToSave = new File("/RecipeApp/WebContent/Images/" +  fileName);
	    //File fileToSave = new File("D:\\Pictures\\Images" +  fileName);
		//Files.copy(fileInputStream, fileToSave.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
		//get the URL of the uploaded file
		String fileUrl = "http://localhost:8080/RecipeApp/Images/" + fileName;
		
		//You can get other form data too
		String name = request.getParameter("name");
		
		//create output HTML that uses the 
		response.getOutputStream().println("<p>Thanks " + name + "! Here's a link to your uploaded file:</p>");
		response.getOutputStream().println("<p><a href=\"" + fileUrl + "\">" + fileUrl + "</a></p>");
		response.getOutputStream().println("<p>Upload another file <a href=\"http://localhost:8080/index.html\">here</a>.</p>");	
		}

	private static String getSubmittedFileName(Part part) {
		  for (String cd : part.getHeader("content-disposition").split(";")) {
		    if (cd.trim().startsWith("filename")) {
		      String fileName = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
		      return fileName.substring(fileName.lastIndexOf('/') + 1).substring(fileName.lastIndexOf('\\') + 1); // MSIE fix.
		    }
		  }
		  return null;
		}
}