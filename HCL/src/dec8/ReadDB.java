package dec8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ReadDB {

public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ArrayList<Employee> arr = new ArrayList<>();
		
		String sql = "Select * from EMPLOYEE";
		String sql1 = "Insert into EMPLOYEE(empname,email,city) values(?,?,?)";

		Class.forName("org.h2.Driver");

		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
		System.out.println("connected");

		PreparedStatement pst = conn.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			Employee e = new Employee(rs.getString(1),rs.getString(2),rs.getString(3));
			//System.out.println(e);
			arr.add(e);
		}
		Collections.sort(arr,new EmpNameCompartor());
		System.out.println(arr);
		

	}

}
