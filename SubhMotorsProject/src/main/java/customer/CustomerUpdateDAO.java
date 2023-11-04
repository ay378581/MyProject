package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.http.HttpServletRequest;

public class CustomerUpdateDAO {
	
	int k;
	
	public int update(CustomerBean cb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("update subh set name=?,address=?,age=?,pincode=? where pword=?"); 
			ps.setString(1, cb.getName());
			ps.setString(2,	cb.getAdd());
			ps.setInt(3, cb.getAge());
			ps.setInt(4, cb.getPin());
			//ps.setFloat(5, cb.getPrice());
			ps.setString(5, cb.getPword());
			
			k = ps.executeUpdate();
			if(k > 0) {
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
