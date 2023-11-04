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

@WebServlet("/product")
public class ProductDetailsServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	HttpSession hs = req.getSession(false);
	
	if(hs==null) {
		pw.println("Session Expired ..");
		RequestDispatcher rd = req.getRequestDispatcher("custlogin.jsp");
		rd.include(req, res);
	}	
	else {
			CustomerBean cb = (CustomerBean)hs.getAttribute("cbean");
			String s = cb.getItem();
			if(s.equals("POWERTRAC 434 PLUS POWERHOUSE")) {
				RequestDispatcher rd = req.getRequestDispatcher("434.html");
				rd.forward(req, res);
			}
			else if(s.equals("EURO 55 NEXT 4WD")) {
				RequestDispatcher rd = req.getRequestDispatcher("Euro55.html");
				rd.forward(req, res);
			}
			else if(s.equals("EURO 50 PLUS NEXT 4WD")) {
				RequestDispatcher rd = req.getRequestDispatcher("Euro50.html");
				rd.forward(req, res);
			}
			else if(s.equals("POWERTRAC 439 PLUS POWERHOUSE")) {
				RequestDispatcher rd = req.getRequestDispatcher("439.html");
				rd.forward(req, res);
			}
			else {
				RequestDispatcher rd = req.getRequestDispatcher("439rdx.html");
				rd.forward(req, res);
			}
		}
		
}
}
