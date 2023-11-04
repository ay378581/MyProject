package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;

public class CustomerLoginDAO {

	CustomerBean cb = null;
	public CustomerBean login(HttpServletRequest req) {
		try {
			Connection con = new DBConnection().getCon();
			PreparedStatement ps = con.prepareStatement("select * from subh where uname=? and pword=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				cb = new CustomerBean();
				cb.setName(rs.getString(1));
				cb.setAdd(rs.getString(2));
				cb.setAge(rs.getInt(3));
				cb.setItem(rs.getString(4));
				cb.setPrice(rs.getFloat(5));
				cb.setUname(rs.getString(6));
				cb.setPword(rs.getString(7));
				cb.setbAmount(rs.getInt(8));
				cb.setYear(rs.getInt(9));
				cb.setState(rs.getString(10));
				cb.setPin(rs.getInt(11));
				cb.setMobile(rs.getLong(12));
				cb.setEmail(rs.getString(13));
				cb.setPremium(rs.getInt(14));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cb;
	}
}
