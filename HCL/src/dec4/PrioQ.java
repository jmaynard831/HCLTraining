package dec4;

import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

public class PrioQ {

	public static void main(String[] args) {

		PriorityQueue<student> pq =  new PriorityQueue<student>();
		
		pq.add(new student(1,"bdo","space","math"));
		pq.add(new student(5,"micke","otoosdjs","disney"));
		pq.add(new student(2,"joe","new mexico","math also"));
		pq.add(new student(4,"albin","taipei","minecraft"));
		
		
//		pq.stream().forEach(x->System.out.println(x));
//		System.out.println();
//		pq.iterator().forEachRemaining(x->System.out.println(x));
//		
//		System.out.println();
//		
		
		 while (!pq.isEmpty()) {
	            System.out.println(pq.remove());
	        }
		
		
		
	}

}
