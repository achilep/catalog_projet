package webapp;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import controller.categorycontroller;
import controller.productcontroller;
@WebServlet(urlPatterns = "/addproduct.ca")

public class addproduct extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		productcontroller prod=new productcontroller();
		categorycontroller cat=new categorycontroller();
		request.setAttribute("category", cat.list_category());
		
		request.getRequestDispatcher("/WEB-INF/views/addproduct.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		//request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		
		  String prd_name = request.getParameter("prod_name");
		  String prd_des = request.getParameter("prod_des");
		  String category_id = request.getParameter("category_id");
		  Part filePart = request.getPart("image");
		  InputStream inputStream = null;
		  System.out.println("53" +prd_name);
		  System.out.println("53" +prd_des);
		  System.out.println("53" +category_id);
		  
		  if (filePart != null) {
	            // debug messages
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());

	            // obtains input stream of the upload file
	            inputStream = filePart.getInputStream();
	        }
		  productcontroller prod=new productcontroller();
		  prod.registration_product(prd_name, prd_des, category_id,inputStream);
		  // cat.update(category_id,category_name,category_description);
		  response.sendRedirect("/product.ca");
		  //request.getRequestDispatcher("/product.ca").forward(request, response);
	    
	}




}
