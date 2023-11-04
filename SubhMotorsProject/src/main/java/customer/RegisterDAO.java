package customer;

import java.sql.*;

public class RegisterDAO {
	
	static int k;
	public static int AddCustomer(CustomerBean cb) {
		try {
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement("insert into subh values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, cb.getName());
		ps.setString(2, cb.getAdd());
		ps.setInt(3, cb.getAge());
		ps.setString(4, cb.getItem());
		ps.setFloat(5, cb.getPrice());
		ps.setString(6, cb.getUname());
		ps.setString(7, cb.getPword());
		ps.setInt(8, cb.getbAmount());
		ps.setInt(9, cb.getYear());
		ps.setString(10, cb.getState());
		ps.setInt(11, cb.getPin());
		ps.setLong(12, cb.getMobile());
		ps.setString(13, cb.getEmail());
		ps.setInt(14, cb.getPremium());
		
		 k = ps.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
		return k;
	}
}
