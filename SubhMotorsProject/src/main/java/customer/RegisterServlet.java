
package customer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")

public class RegisterServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			CustomerBean cb = new CustomerBean();
			 cb = new CustomerLoginDAO().login(req);
			if(cb==null) {
				cb = new CustomerBean();
			cb.setName(req.getParameter("name"));
			cb.setAge(Integer.parseInt(req.getParameter("age")));
			cb.setAdd(req.getParameter("add"));
			cb.setState(req.getParameter("state"));
			cb.setPin(Integer.parseInt(req.getParameter("pin")));
			cb.setUname(req.getParameter("uname"));
			cb.setPword(req.getParameter("pword"));
			cb.setItem(req.getParameter("item"));
			cb.setPrice(new ViewCustomerItemPrice().itemprice(req.getParameter("item")));
			cb.setbAmount(Integer.parseInt(req.getParameter("bamt")));
			cb.setMobile(Long.parseLong(req.getParameter("mobile")));
			cb.setEmail(req.getParameter("email"));
			cb.setPremium(0);
			cb.setYear(Integer.parseInt(req.getParameter("year")));
			
			int k = RegisterDAO.AddCustomer(cb);

			if (k > 0) {
				pw.println("<br> Successfully Added ..");
				RequestDispatcher rd = req.getRequestDispatcher("homepage.html");
				rd.include(req, res);
			} else {
				pw.println("<br> Error Occured ..");
				RequestDispatcher rd = req.getRequestDispatcher("reg.html");
				rd.include(req, res);
			}
		}else {
			pw.println(cb.getName()+" You are Already Registered ..");
			RequestDispatcher rd = req.getRequestDispatcher("custlogin.html");
			rd.include(req, res);
		} 
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
