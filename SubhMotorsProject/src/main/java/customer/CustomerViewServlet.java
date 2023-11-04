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

@WebServlet("/cview")

public class CustomerViewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession(false);
		
		if(hs==null) {
			req.setAttribute("msg", "Session Expired ..");
			RequestDispatcher rd = req.getRequestDispatcher("custlogin.jsp");
			rd.include(req, res);
		}else {
			CustomerBean cb = (CustomerBean)hs.getAttribute("cbean");
			pw.println("<html><head><link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css\">\r\n"
					+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\r\n"
					+ "</head><body bgcolor=#f4f4f4>\r\n"
					+ "<header class=\"d-flex justify-content-center bg-danger text-white p-2\">\r\n"
					+ "\r\n"
					+ "		<div >\r\n"
					+ "			<span class=\"me-3\">CONNECT FOR TRACTOR EXCHANGE</span> <span\r\n"
					+ "				class=\"me-3\">CONNECT WITH OUR CUSTOMERS</span> <span class=\"me-3\">TESTIMONIALS</span>\r\n"
					+ "			<span class=\"me-3\">COMPARE TRACTOR</span> <span class=\"me-3\">TAKE\r\n"
					+ "				A TOUR</span> <span class=\"me-3\">|</span> <span\r\n"
					+ "				class=\"bi bi-translate me-3\"></span> <span class=\"me-3\">English</span>\r\n"
					+ "		</div>\r\n"
					+ "\r\n"
					+ "	</header>\r\n"
					+ "	<header\r\n"
					+ "		class=\"d-flex justify-content-between bg-white text-black p-2 mt-2\">\r\n"
					+ "		<div style=\"widht: 8px\">\r\n"
					+ "			<h3 class=\"fw-bold text-danger\">POWERTRAC</h3>\r\n"
					+ "		</div>\r\n"
					+ "		<div class=\"d-flex justify-content-center\">\r\n"
					+ "				<a class=\"nav-link\" href=\"homepage.html\"> <span class=\"me-3\">HOME</span></a><span class=\"me-3\">About US</span> <span\r\n"
					+ "				class=\"me-3\">OUR TRACTORS</span> <span class=\"me-3\">OFFERS</span> <span\r\n"
					+ "				class=\"me-3\">FIND A DEALER</span> <span class=\"me-3\">GET\r\n"
					+ "				PRICE</span>\r\n"
					+ "		</div>\r\n"
					+ "		<div>\r\n"
					+ "			<span class=\"bi bi-search me-3\"></span> <span\r\n"
					+ "				class=\"bi bi-whatsapp me-3\"></span>\r\n"
					+ "		</div>\r\n"
					+ "	</header>");
			pw.println("<div class=ms-2>");
			pw.println("Name : "+cb.getName()+"<br>");
			pw.println("Age : "+cb.getAge()+"<br>");
			pw.println("Phone No. : "+cb.getMobile()+"<br>");
			pw.println("Email : "+cb.getEmail()+"<br>");
			pw.println("Address : "+cb.getAdd()+"<br>");
			pw.println("Pincode : "+cb.getPin()+"<br>");
			pw.println("State : "+cb.getState()+"<br>");
			pw.println("Item : "+cb.getItem()+"<br>");
			pw.println("Finance for Years : "+cb.getYear()+"<br>");
			pw.println("Price : "+cb.getPrice()+"<br>");
			pw.println("Booking Amount : "+cb.getbAmount()+"<br>");
			
			float Premium = (cb.getPrice()- cb.getbAmount())/(cb.getYear()*12);
			float pending = cb.getPrice()- ( cb.getbAmount() + cb.getPremium()*Premium);
			pw.println("Pending Amount : "+pending+"<br>");
			pw.println("Per Month Premium : "+Premium+"<br>");
			pw.println("Paid No. Premiums : "+cb.getPremium()+"<br>");
			pw.println("<br><br><button><a class=nav-link href=custloginpage.jsp>Back</a></button>");
			pw.println("<button onclick=window.print()>Print</button>");
			pw.println("<button><a class=nav-link href=clog>Logout</a></button>");
			pw.println("</div>");
			pw.println("<header>\r\n"
					+ "		<div style=\"height:200px;\" class=\"d-flex justify-content-between bg-danger text-white p-2 mt-4\">\r\n"
					+ "			<div>\r\n"
					+ "				<h3 class=\"fw-bold ms-4 mt-4\">POWERTRAC</h3><br>\r\n"
					+ "				<div class=\"d-flex justify-content-left\">\r\n"
					+ "				<h2><span class=\"bi bi-youtube ms-4 \"></span></h2>\r\n"
					+ "				<h2><span class=\"bi bi-facebook  ms-4\"></span></h2>\r\n"
					+ "				<h2><span class=\"bi bi-instagram ms-4\"></span></h2>\r\n"
					+ "				</div>\r\n"
					+ "			</div>\r\n"
					+ "			<div></div>\r\n"
					+ "			<div></div>\r\n"
					+ "		<div><br>\r\n"
					+ "			<h6 class=\"mt-4\">PRODUCTS & SERVICES</h6><br>\r\n"
					+ "			Tractors<br>\r\n"
					+ "			Compare Tractors\r\n"
					+ "		</div>\r\n"
					+ "			<div><br>\r\n"
					+ "			<h6 class=\"mt-4\">QUICK LINKS</h6><br>\r\n"
					+ "			Request a demo<br>\r\n"
					+ "			Find a dealer\r\n"
					+ "		</div>\r\n"
					+ "		<div><br>\r\n"
					+ "			<h6 class=\"mt-4\">COMPANY</h6><br>\r\n"
					+ "			About Us<br>\r\n"
					+ "			Terms of Use<br>\r\n"
					+ "			Privacy Policy\r\n"
					+ "		</div>\r\n"
					+ "			<div></div>\r\n"
					+ "		</div>\r\n"
					+ "	</header>\r\n"
					+ "	<footer>\r\n"
					+ "		<div style=\"background-color:#cc0033;height:70px;\"class=\"text-white\">\r\n"
					+ "		<br><h6 class=\" ms-4\">© 2022 Escorts Limited. All rights reserved.</h6>\r\n"
					+ "		</div>\r\n"
					+ "		\r\n"
					+ "	</footer>"
					
					+ "</body></html>");
		}
	}

}
