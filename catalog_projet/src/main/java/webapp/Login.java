package webapp;

import java.io.IOException;
import controller.usercontroller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Login.ca")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		usercontroller user=new usercontroller();
		 if(user.userauthentification(username, password)==0) {
			 request.setAttribute("echec", "invalide user please try again");
			 request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		 }
		 else {
			 
			 request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response); 
		 }
		
	}

}
