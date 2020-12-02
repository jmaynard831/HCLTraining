package emailArraySearch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {

	public static void main(String[] args) {

		// Make a big array filled with email addresses
		String[] emails = new String[] { "jacob.manard@hcl.com", "x@y.net", "test@fake.com", "freemason@aol.com",
				"samw1se@comcast.com.nz", "cadiladiladilac@lonelysingles.com", "free_online_robux@conncast.biz.ru" };

		// init scanner
		Scanner inputscan = new Scanner(System.in);

		// loop a few times
		for (int i = 0; i < 10; i++) {

			//init vars 
			boolean flag = false;
			
			//take an email address
			System.out.println("Input the search email: ");
			String email = inputscan.nextLine();

			// validate that "x@y.z" format
			email = email.toLowerCase();
			Pattern p = Pattern.compile("(^[a-z0-9]+)(.[a-z0-9]*)*@([a-z0-9]+)\\.((.*)[a-z0-9]+)*");
			Matcher m = p.matcher(email);

			if (m.matches()) {
				// search the array for it
				for (String string : emails) {
					if (string.equals(email)) {
						flag = true;
						break;
					}

				}
				//Print confirmations
				if (flag) {
					//valid found
					System.out.println("Yes, " + email + " is in our array!");
				} else {
					//valid not found
					System.out.println("No, we do not have " + email + " in our array.");
				}
			} else {
				//Invalid email
				System.out.println("Please input a valid email address.");
			}


			System.out.println();
		}

		inputscan.close();
	}

}
