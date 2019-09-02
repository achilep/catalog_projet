package webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import controller.categorycontroller;
import controller.productcontroller;
import controller.welcomecontroller;
@MultipartConfig(maxFileSize = 16177215)

@WebServlet(urlPatterns = {"/modifyproduct.ca"})
public class modyfyprod extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		productcontroller to_modify=new  productcontroller();
		categorycontroller cat=new categorycontroller();
		request.setAttribute("category", cat.list_category());
		
		String product_id = request.getParameter("product_id");
		
		request.setAttribute("prodtoupdate", to_modify.product_to_updad(product_id));
		request.setAttribute("update", "update");
		request.getRequestDispatcher("/WEB-INF/views/add&updat.jsp").forward(request, response);
    	
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		 String prod_name = request.getParameter("prod_name");
		  String prod_des = request.getParameter("prod_des");
		  String product_id = request.getParameter("product_id");
		  String category_id = request.getParameter("category_id");
		  //int category_id = Integer.parseInt(cat);	
		  Part filePart = request.getPart("image");
		  InputStream inputStream = null;
		  if (filePart != null) {
	            // debug messages
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());

	            // obtains input stream of the upload file
	            inputStream = filePart.getInputStream();
		  }
		  // cat.update(category_id,category_name,category_description);
		  productcontroller modify=new  productcontroller(); 
		  modify.update(product_id, prod_name, prod_des,category_id,inputStream);
		  System.out.print(product_id);
		  
		  request.getRequestDispatcher("/product.ca").forward(request, response);
	    		
	}
	


}
