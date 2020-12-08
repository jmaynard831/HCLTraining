package personal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BigRecursive {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 1, 2, 3, 4));

		System.out.println(biggest(q, q.poll()));
		
		
		System.out.println("factorial: "+factorial(8));
	}

	private static int factorial(int i) {
		if(i==1) {
			return 1;
		}
		return factorial(i-1)*i;
		
	}

	//biggest num in list
	private static int biggest(Queue<Integer> q, Integer biggest) {
		if (q.isEmpty()) {
			return biggest;
		}
		int num = q.poll();
		if (num > biggest) {
			return biggest(q, num);
		} else {
			return biggest(q, biggest);
		}

	}

}
