package miniapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeImpl implements Employee{

	@Override
	public void addEmployee(Emp e) throws BadException {
		
		
		try {
			FileOutputStream fos = new FileOutputStream("c:/fakeplace/files");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			throw new BadException("Sorry its all broke.", e1);
		}
		
	}

}
