package customer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/clogin")
public class CustomerLoginServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		CustomerBean cb = new CustomerLoginDAO().login(req);
		
		if(cb==null) {
			pw.println("Invalid UserName/Password");
			RequestDispatcher rd = req.getRequestDispatcher("homepage.html");
			rd.include(req, res);
		}else {
			HttpSession hs = req.getSession();
			hs.setAttribute("cbean", cb);
			RequestDispatcher rd = req.getRequestDispatcher("custloginpage.jsp");
			rd.include(req, res);
			
		}
	}
}
