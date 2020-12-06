package dec3.dataStructures;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] rotarray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(rotarray));

		rotateArray(rotarray, 123);

		System.out.println(Arrays.toString(rotarray));

	}

	static void rotateArray(int[] arr, int places) {
		// every element in this array needs to move x places forward
		int[] arr2 = arr.clone();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr2[(i + places) % arr.length];
		}

	}

}
