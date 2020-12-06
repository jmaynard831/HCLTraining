package longestSubsequence;

import java.util.*;

public class LongestSubNC {

	public static void main(String[] args) {

		// Init an array of numbers
		int[] numlist = new int[100];
		// populate it with random values
		popArray(numlist);

		/*
		 * We store the data in a list of lists.
		 * 
		 * The algorith works by sorting a list of numbers into every possible list of
		 * increasing values. It then takes the longest of these lists and prints those,
		 * thus finding the longest possible (nonconsecutive) subsequence in the initial
		 * list.
		 */
		LinkedList<LinkedList<Integer>> gll = new LinkedList<>();

		// The first line is always empty, so init and continue
		gll.add(new LinkedList<Integer>(Arrays.asList(numlist[0])));

		// For every number in the numlist
		for (int x = 1; x < numlist.length; x++) {
			// Check every sublist for increasing values
			int cap = gll.size();
			for (int y = 0; y < cap; y++) {
				// If the current number is bigger, append
				if (gll.get(y).getLast() < numlist[x]) {
					gll.get(y).add(numlist[x]);
				}
			}
			// Create a new list for each entry
			gll.add(new LinkedList<Integer>(Arrays.asList(numlist[x])));
		}

		// Print results
		System.out.println("Starting array: \n" + Arrays.toString(numlist));
		System.out.println("Sublists: \n" + gll + "\nLongest sublist: ");
		printSubLists(gll);
	}

	public static void printSubLists(LinkedList<LinkedList<Integer>> ll) {
		// Find longest list length
		int longestlength = ll.get(0).size();

		// Update longest list length
		for (LinkedList<Integer> l : ll) {
			if (longestlength < l.size()) {
				longestlength = l.size();
			}
		}

		// Print out any lists with that length!
		final int NUM = longestlength;
		ll.stream().forEach(x -> {
			if (x.size() == NUM) {
				System.out.println(x);
			}
		});

	}

	// Populate an array with vals 0-9.
	public static void popArray(int[] vals) {
		for (int x = 0; x < vals.length; x++) {
			vals[x] = (int) (Math.random() * 10);
		}
	}

}

// old interior code for that other alg
/*
 * 
 * //if the last entry of the last list is smaller than this num //then add it
 * to the list if(gll.get(gllflag).getLast()<numlist[x]) {
 * gll.get(gllflag).add(numlist[x]); } //if the last entry of the last list is
 * same/bigger, then //gllflag++ and then make a new list, and append this num
 * else{ gllflag++; gll.add(new LinkedList<Integer>(Arrays.asList(numlist[x])));
 * }
 */
