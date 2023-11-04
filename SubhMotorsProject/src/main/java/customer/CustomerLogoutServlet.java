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

@WebServlet("/clog")
public class CustomerLogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			pw.println("Session Expired ..");
			
		}else {
			hs.removeAttribute("cbean");
			hs.invalidate();
			pw.println("Logout SuccessFully ...");
		}
		RequestDispatcher rd = req.getRequestDispatcher("homepage.html");
		rd.include(req, res);
	}

}
