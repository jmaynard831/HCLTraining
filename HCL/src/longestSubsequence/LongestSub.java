package longestSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
//Dont run this one - run LongestSubNC
//Done with arraylists 
public class LongestSub {

	public static void main(String[] args) {

		// Init an array of nums
		int[] numList = new int[100];
		// populate it with random values
		popArray(numList);

		// This is the DS i decided on yeah its sad
		ArrayList<ArrayList<Integer>> sub = new ArrayList<ArrayList<Integer>>();

		// Init this with the first val
		sub.add(new ArrayList<Integer>(Arrays.asList(numList[0])));

		// Set these two navigational vars im sorry
		int vplace = 0, xplace = 0;

		// For each val, check if the next is larger than the current one
		// Which means place it on the same row
		// Or smaller, so it gets its own row
		for (int x = 1; x < numList.length; x++) {
			if (numList[x] > sub.get(vplace).get(xplace++)) {
				sub.get(vplace).add(numList[x]);
			} else {
				xplace = 0;
				vplace++;
				sub.add(new ArrayList<Integer>(Arrays.asList(numList[x])));
			}

		}

		System.out.println("The array is:\n" + Arrays.toString(numList));

		System.out.println("The longest subsequence is: " + sub.get(getLongestLength(sub)));

	}

	public static int getLongestLength(ArrayList<ArrayList<Integer>> sub) {
		int highestLen = sub.get(0).size();
		int index = 0;

		for (int x = 0; x < sub.size(); x++) {
			if (sub.get(x).size() > highestLen) {
				highestLen = sub.get(x).size();
				index = x;
			}
		}

		return index;
	}

	// Populate an array with vals 0-9.
	public static void popArray(int[] vals) {

		for (int x = 0; x < vals.length; x++) {
			vals[x] = (int) (Math.random() * 10);
		}
	}

}
