package dec7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbtesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");

		Connection conn = DriverManager.getConnection("jdbc:h2:./data/db");
		System.out.println("connected");
		
		
		
	}

}
