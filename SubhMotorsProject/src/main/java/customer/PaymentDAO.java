package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PaymentDAO {
	int k;
	public int payment(CustomerBean cb) {
		try {
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement("update subh set premium=? where uname=? and pword=?");
		ps.setInt(1, cb.getPremium());
		ps.setString(2, cb.getUname());
		ps.setString(3, cb.getPword());
		k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return k;
	}
}
