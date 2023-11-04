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

@WebServlet("/cpay")
public class CustomerPaymentServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession(false);
		if (hs == null) {
			RequestDispatcher rd = req.getRequestDispatcher("custlogin.jsp");
			rd.include(req, res);
		} else {
			CustomerBean cb = (CustomerBean) hs.getAttribute("cbean");
			int number_of_premium = cb.getPremium();
			int new_premium = Integer.parseInt(req.getParameter("kist"));
			cb.setPremium(number_of_premium + new_premium);
			int k = new PaymentDAO().payment(cb);
			if (k > 0) {
				req.setAttribute("msg", "Payment Successfull ..");
				RequestDispatcher rd = req.getRequestDispatcher("CustomerPayment.jsp");
				rd.include(req, res);
			} else {
				cb.setPremium(number_of_premium);
				req.setAttribute("msg", "Payment Failed ..");
				hs.removeAttribute("cbean");
				hs.invalidate();
				RequestDispatcher rd = req.getRequestDispatcher("custlogin.jsp");
				rd.include(req, res);
			}
		}

	}

}
