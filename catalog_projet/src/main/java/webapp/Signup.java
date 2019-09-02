package webapp;

import controller.user;
import controller.usercontroller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Signup.ca")
public class Signup extends HttpServlet {
	protected usercontroller signup=new usercontroller();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		request.getRequestDispatcher("/WEB-INF/views/Signup.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String username=request.getParameter("username");
		List<String> unique = new ArrayList();
		unique =signup.unique_user(username);
		if(unique.size()>1){
			
			request.setAttribute("dpuser", "username already user it must be unique");
			request.getRequestDispatcher("/WEB-INF/views/Signup.jsp").forward(request, response);
			
			
			
			
			 	
		}else {signup.registraion(name, username, password);
		request.getSession().setAttribute("user",signup.attribute_user(username, password));
		response.sendRedirect("/welcome.ca");
		 
		//request.getRequestDispatcher("/welcome.ca").forward(request, response);
		//request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		
			
		}
	}




}
