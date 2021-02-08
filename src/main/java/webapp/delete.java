package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.productcontroller;


@WebServlet(urlPatterns = "/delete.ca")
public class delete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		productcontroller delet=new  productcontroller(); 
		String product_id = request.getParameter("product_id");
		delet.delete(product_id);
		request.getRequestDispatcher("welcome.ca").forward(request, response);
		
		 

}
}
