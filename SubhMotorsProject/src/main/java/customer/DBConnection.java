package customer;

import java.sql.*;

public class DBConnection {

	private static Connection con = null;

	public static Connection getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "c##aakash", "aakash");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
