package personal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class hashmaps {

	public static void main(String[] args) {

		//HM has no order at all
		HashMap<String, Integer> hm = new HashMap();
		
		hm.put("Hello",14);
		hm.put("Hellor",14);
		hm.put("aello",16);
		hm.put("pie",14);
		hm.put("get",14);
		hm.put("bbb",16);
		
		System.out.println(hm);
		
		//lhm maintains insertion order, no dupes ofc
		LinkedHashMap<String, Integer> hm2 = new LinkedHashMap<>();
		
		hm2.put("Yo4", 12);
		hm2.put("Yo2", 32);
		hm2.put("Yo3", 102);
		hm2.put("gasstas", 12);
		hm2.put("florida", 12);
		hm2.put("mesoamerica", 12);
		
		int a,b=4,c;
		
		
		System.out.println(hm2.keySet());
		
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("hello");
		hs.add("cat");
		hs.add("dog");
		
		System.out.println(hs);
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("hey");
		lhs.add("you");
		lhs.add("you");
		
		System.out.println(lhs);
		
		/*
		 * My situation
		 * We are adding a bunch of single items 
		 * and the order is important
		 * uhh there are duplicates pogchamp
		 * 
		 * linked lists? 
		 * we can certainly add more elements to it without defining size
		 * dups are fine, reading is ok, order is preserved
		 * 
		 * 
		 */
		
		
		
	}

}
