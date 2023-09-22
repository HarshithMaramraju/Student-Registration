package SignUp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registor extends GenericServlet {


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("username");
		String email = req.getParameter("useremail");
		String password = req.getParameter("userpassword");
		long phone = Long.parseLong(req.getParameter("userphone"));

		Details details = new Details();
		details.setName(name);
		details.setEmail(email);
		details.setPassword(password);
		details.setPhone(phone);

		DetailsDao detailsDao = new DetailsDao();
		detailsDao.insert(details);

		System.out.println("Success");
	}

}
