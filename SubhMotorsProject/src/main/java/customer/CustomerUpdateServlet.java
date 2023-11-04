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

@WebServlet("/cupdate")

public class CustomerUpdateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			pw.println("Session Expired ..");
			RequestDispatcher rd = req.getRequestDispatcher("custloginpage.jsp");
			rd.include(req, res);
		}
		else {
			CustomerBean cb = (CustomerBean)hs.getAttribute("cbean");
			cb.setName(req.getParameter("name"));
			cb.setAge(Integer.parseInt(req.getParameter("age")));
			cb.setAdd(req.getParameter("add"));
			cb.setPin(Integer.parseInt(req.getParameter("pin")));
			cb.setPword(req.getParameter("pword"));
		int k = new CustomerUpdateDAO().update(cb);
		if(k > 0) {
			pw.println("Profile Updated ..");
			
		}
		else {
			pw.println("Invalid Password ..");
		}
		RequestDispatcher rd = req.getRequestDispatcher("custloginpage.jsp");
		rd.include(req, res);
	}
	}

}
