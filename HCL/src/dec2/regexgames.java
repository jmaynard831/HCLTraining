package dec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexgames {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9_.-]*");
		Matcher m = p.matcher("heel o ");
		System.out.println(m.matches());
		
	}
	
}
