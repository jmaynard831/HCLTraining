package dec3.dataStructures;

import java.util.*;

public class SortLists {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>(Arrays.asList(3, 2, 17, 5, 4, 1));

		Collections.sort(al);

		al.stream().forEach(x -> {
			System.out.println(x);
		});
	}

}
