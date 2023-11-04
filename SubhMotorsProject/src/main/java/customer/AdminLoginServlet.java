package customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/adlog")
public class AdminLoginServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
		try {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
	ResultSet rs = new AdminloginDAO().checkAdmin(req);
	if(rs!=null) {
	pw.println("<html>\r\n"
			+ "<head>\r\n"
			+ "<meta charset=\"UTF-8\">\r\n"
			+ "<title>Customer Login</title>\r\n"
			+ "<link rel=\"icon\" href=\"https://www.google.com/url?sa=i&url=https%3A%2F%2Flogosandtypes.com%2Falphabet%2Fletter-e%2Fescorts%2F&psig=AOvVaw0_A7rOnyQbUla9o0AO4_N5&ust=1678688474162000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCPCBjfrf1f0CFQAAAAAdAAAAABAE\" style=\"height:10px\">\r\n"
			+ "\r\n"
			+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css\">\r\n"
			+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "\r\n"
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
			+ "				<a class=\"nav-link\" href=\"homepage.html\"> <span class=\"me-3\">HOME</span><a class=\"nav-link\" href=\"aboutUs.html\"><span class=\"me-3\">ABOUT US</span></a> <span\r\n"
			+ "				class=\"me-3\">OUR TRACTORS</span> <span class=\"me-3\">OFFERS</span> <span\r\n"
			+ "				class=\"me-3\">FIND A DEALER</span> <span class=\"me-3\">GET\r\n"
			+ "				PRICE</span>\r\n"
			+ "		</div>\r\n"
			+ "		<div>\r\n"
			+ "			<span class=\"bi bi-search me-3\"></span> <span\r\n"
			+ "				class=\"bi bi-whatsapp me-3\"></span>\r\n"
			+ "		</div>\r\n"
			+ "	</header>");
	pw.println("<table border=10px align=center>");
	pw.println("<tr>");
	pw.println("<td><dt>Customer Name</dt></td><td><dt>Address</dt></td><td><dt>Age</dt></td><td><dt>Tractor Model</dt></td><td><dt>Tractor Price</dt></td><td><dt>Username</dt></td><td><dt>Password</dt></td><td><dt>Booking Amount</dt></td><td><dt>Finance for Year</dt></td><td><dt>State</dt></td><td><dt>Pincode</dt></td><td><dt>Mobile no.</dt></td><td><dt>Email</dt></td><td><dt>Premium Paid</dt></td><br>");
	pw.println("</tr>");
	
	while(rs.next()) {
		pw.println("<tr>");
		pw.println("<td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getInt(5)+"</td><td>"+rs.getString(6)+"</td><td>"+
		rs.getString(7)+"</td><td>"+rs.getInt(8)+"</td><td>"+rs.getInt(9)+"</td><td>"+rs.getString(10)
		+"</td><td>"+rs.getInt(11)+"</td><td>"+rs.getLong(12)+"</td><td>"+rs.getString(13)+"</td><td>"+rs.getInt(14)+"</td><br>");
		pw.println("</tr>");
	}
	pw.println("</table>");
			pw.println("<button><a class=nav-link href=adminlogin.html>Back</button>"
			+ "<button><a class=nav-link href=clog>Logout</button>");
	
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
			+ "	</footer>\r\n"
			+ "</body>\r\n"
			+ "</html>");
		}
	
	else {
		pw.println("Not Authenticated User ..");
		RequestDispatcher rd = req.getRequestDispatcher("adminlogin.html");
		rd.include(req, res);
	}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
