package SignUp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Email = req.getParameter("username");
		String Password = req.getParameter("userpassword");
		
		DetailsDao detailsDao = new DetailsDao();
		Details details = detailsDao.fetch(1);
		
		if (Email.equals(details.getEmail()) && Password.equals(details.getPassword()))
		{
			resp.sendRedirect("https://www.amazon.in/");
		}
		else
		{
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("invalid pass or email");
		}
	}

}
