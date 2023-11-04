package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewCustomerItemPrice {

float itemPrice;
	
	public float itemprice(String s) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from items where model=?");
			ps.setString(1, s);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				itemPrice = rs.getFloat(2);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return itemPrice;	
}
}
