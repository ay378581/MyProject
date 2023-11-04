package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;

public class AdminloginDAO {

	ResultSet rs,rs1=null;
	public ResultSet checkAdmin(HttpServletRequest req) {
	
		try {
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement("select * from admin where uname=? and pword=?");
	
		ps.setString(1, req.getParameter("uname"));
		ps.setString(2, req.getParameter("pword"));
		rs = ps.executeQuery();
		if(rs.next()) {
			PreparedStatement ps1 = con.prepareStatement("select * from subh");
			rs1 = ps1.executeQuery();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rs1;
	}
}
