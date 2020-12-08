package personal;

import java.util.Arrays;

public class LIStests {

	public static void main(String[] args) {

		int[] arr = new int[] {100,1,2,4,2,6};
		
		System.out.println(Arrays.toString(arr));
		//i give u an array, and an index.
		//u tell me how many nums are bigger than that val @ the index
		//i also want this in an array, ie for every value
		System.out.println(Arrays.toString(bigValChecker(arr)));
		
		//now get biggest big num after an index
		System.out.println(getRightBignum(bigValChecker(arr), 0));
	}

	private static int getRightBignum(int[] bigValChecker, int i) {
		int bigval = bigValChecker[i];
		int index =-1;
		for(int x=i;x<bigValChecker.length;x++) {
			if(bigValChecker[x]>bigval) {
				bigval=bigValChecker[x];
				index=x;
			}
		}
		return index;
		
	}

	private static int[] bigValChecker(int[] arr) {
		int[] bigs = new int[arr.length];
		for(int x=0; x<arr.length;x++) {
			bigs[x]=getValCounts(arr,x);
		}
		return bigs;
	}

	private static int getValCounts(int[] arr, int index) {
		int val = arr[index];
		int count=0;
		for(int x=index; x<arr.length;x++) {
			if(arr[x]>val) {
				count++;
			}
		}
		return count;
	}

	
	
}
