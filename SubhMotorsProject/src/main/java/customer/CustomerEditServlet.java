
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

@WebServlet("/cedit")

public class CustomerEditServlet extends HttpServlet {
	
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
			pw.println("<html><head><style>input{float:right;margin-right:72px}</style>");
			pw.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css\">\r\n"
					+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\r\n"
					+ "</head>");
			
			
			pw.println("<body><header class=\"d-flex justify-content-center bg-danger text-white p-2\">\r\n"
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
					+ "	</header><center><div style=width:400px;height:400px;>");
			
			
			pw.println("<form action='cupdate' method='post'>");
			pw.println("Name :<input type=text name=name value="+cb.getName()+"><br><br>");
			pw.println("Age :<input type=text name=age value="+cb.getAge()+"><br><br>");
			pw.println("Address :<input type=text name=add value="+cb.getAdd()+"><br><br>");
			pw.println("pincode :<input type=text name=pin value="+cb.getPin()+"><br><br>");
			pw.println("<br>Password<input type=password name=pword value="+cb.getPword()+"><br>");
			pw.println("<br><br><input type=submit>");
			pw.println("<button><a class=nav-link me-4 href=custloginpage.jsp>Back</a></button>");
			pw.println("</from></div></center>");
			
			
			
			pw.println("<header\r\n"
					+ "		class=\"d-flex justify-content-center bg-danger text-white p-4 mt-4\">\r\n"
					+ "\r\n"
					+ "		<div class=\"d-flex justify-content-center\">\r\n"
					+ "\r\n"
					+ "			<span class=\"me-3\">By Power : </span> <span class=\"me-3\">Select\r\n"
					+ "				dropdown</span> <span class=\"me-3\">By Series : </span> <span class=\"me-3\">Select\r\n"
					+ "				dropdown</span> <span class=\"me-3\">By Sorting : </span> <span class=\"me-3\">Default</span>\r\n"
					+ "	</header>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\r\n"
					+ "");
			pw.println("</body></html>");
		}
	}

}
