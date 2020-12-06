package dec3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {

	public static void main(String[] args) throws IOException {
		// Jeff 100999999 obob@aol.com FL
		// take input from args
		// name, inc, email, state
		if (args.length == 4) {
			// Now confirm the params with regerx
			Pattern p = Pattern.compile("[0-9]{0,8}");
			Matcher incomeMatch = p.matcher(args[1]);

			p = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+");
			Matcher emailMatch = p.matcher(args[2]);

			p = Pattern.compile("[a-zA-Z0-9]{2,3}");
			Matcher stateMatch = p.matcher(args[3]);

			// if income isnt max of 8 numbers, break
			if (incomeMatch.matches() & emailMatch.matches() & stateMatch.matches()) {
				System.out.println("Valid params");
				System.out.println(new Emp(args[0], Integer.parseInt(args[1]), args[2], args[3]));
				FileOutputStream f = new FileOutputStream("EmployeeRecords.txt");
				ObjectOutputStream o = new ObjectOutputStream(f);
				o.writeObject(new Emp(args[0], Integer.parseInt(args[1]), args[2], args[3]));

			} else {
				System.out.println("Invalid Params");
			}

		} else {
			System.out.println("PLEASE GIVE: NAME INCOME EMAIL STATE");
		}

	}

}
