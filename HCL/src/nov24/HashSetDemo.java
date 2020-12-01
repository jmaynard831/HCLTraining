package nov24;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String args[]) {
		
		HashSet<Emp> al = new HashSet<Emp>();
		

		al.add(new Emp("nick",60));
		al.add(new Emp("stan",111));
		al.add(new Emp("amar",103));
		al.add(new Emp("kelly",105));
		al.add(new Emp("kelly",105));		
		Emp x = new Emp("kelly",105);
		
		al.add(x);
		al.add(x);
		
		//System.out.println(al);
		
		
		TreeSet<Emp> ts = new TreeSet<Emp>();
		
		ts.add(new Emp("nick",99));
		ts.add(new Emp("bob",11));
		ts.add(new Emp("horatio",14));
		ts.add(new Emp("Ellen The Generous",600));
		
		System.out.println(ts);
		
	}
	
}
