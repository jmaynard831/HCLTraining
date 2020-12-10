package dec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streams {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("bob");
		al.add("brick");
		al.add("barry");
		al.add("susan");
		
		
		//al.stream().sorted().map(String::toUpperCase).filter(x->x.startsWith("B")).forEach(x->System.out.println(x));
		

		List<String> lis = al.stream().sorted().map(String::toUpperCase).filter(x->x.startsWith("B"))
				.collect(Collectors.toList());
		
		System.out.println(lis);
	}
	
}

