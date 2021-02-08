package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.categorycontroller;
import controller.welcomecontroller;

@WebServlet(urlPatterns = "/category.ca")
public class categoryservlet extends HttpServlet {
	
	private categorycontroller cat=new categorycontroller();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		
		welcomecontroller con=new welcomecontroller();
		categorycontroller ca=new categorycontroller();
        request.setAttribute("categ", ca.list_category());
		request.getRequestDispatcher("/WEB-INF/views/category.jsp").forward(request, response);
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		 String category_name = request.getParameter("cat_name");
		  String category_description = request.getParameter("cat_des");
		  cat.registraion_category(category_name,category_description);
		  response.sendRedirect("/category.ca");	
	}
		

	}


