package nov24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Emp> al = new LinkedList<Emp>();
		
		al.add(new Emp("nick",60));
		al.add(new Emp("stan",111));
		al.add(new Emp("amar",103));
		al.add(new Emp("kelly",105));
		
		((LinkedList<Emp>) al).addLast(new Emp("jones",22));
		
		
		//Collections.sort(al, new EmpNameComparator());
		
		System.out.println(al);
		
	}

}
