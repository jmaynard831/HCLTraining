package dec7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String sql1 = "Select * from EMPLOYEE";
		String sql = "Insert into EMPLOYEE(empname,email,city) values(?,?,?)";
		
		
		Class.forName("org.h2.Driver");

		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
		System.out.println("connected");

		PreparedStatement pst = conn.prepareStatement(sql);
		//pst.setInt(1, 1);
		pst.setString(1,"Владимир");
		pst.setString(2,"箸箸箸");
		pst.setString(3,"london");
		
		pst.executeUpdate();
		
		System.out.println("Updated");
	}

}
