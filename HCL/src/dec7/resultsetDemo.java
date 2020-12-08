package dec7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class resultsetDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		String sql = "Select * from EMPLOYEE";
		String sql1 = "Insert into EMPLOYEE(empname,email,city) values(?,?,?)";

		Class.forName("org.h2.Driver");

		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
		System.out.println("connected");

		PreparedStatement pst = conn.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString(1);
			String email =rs.getString(2);
			String city = rs.getString(3);
			System.out.println(name +" "+ email+" "+city);
		}
		

	}
}
