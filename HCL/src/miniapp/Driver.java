package miniapp;

import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e = new Emp("Phil", "Chef");
		
		Employee e1 = new EmployeeImpl();
		
		try {
			e1.addEmployee(e);
		} catch (BadException e2) {
			// TODO Auto-generated catch block
			System.out.println(e2.getMessage());
		}
		
		
		
	}

}
