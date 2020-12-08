package dec8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String sql = "Update EMPLOYEE set empname=? where city=?";
		String del = "Delete from Employee where empname =?";

		String ins = "Insert into EMPLOYEE(empname,email,city) values(?,?,?)";

		Class.forName("org.h2.Driver");

		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
		System.out.println("connected");

		PreparedStatement pst = conn.prepareStatement(ins);

		Employee e = new Employee(args[0], args[1], args[2]);
		System.out.println(e);
		try {
			pst.setString(1, e.getEmpname());
			pst.setString(2, e.getEmail());
			pst.setString(3, e.getCity());

			pst.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		System.out.println("Updated");

	}

}
