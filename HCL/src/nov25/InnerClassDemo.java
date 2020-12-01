package nov25;

public class InnerClassDemo {

	private static final int ARRAY_SIZE = 15;
	private int[] arrayInts = new int[ARRAY_SIZE];

	public InnerClassDemo() {
		for (int x = 0; x < ARRAY_SIZE; x++) {
			arrayInts[x] = x;
		}
	}

	public void printEven() {
		InnerClass iter = new InnerClass();
		while (iter.hasNext()) {
			System.out.println(iter.getNext() + " ");
		}
	}

	public static void main(String[] args) {
		InnerClassDemo icd = new InnerClassDemo();
		icd.printEven();
	}

	private class InnerClass {
		private int next = 0;

		private boolean hasNext() {
			return (next <= ARRAY_SIZE - 1);
		}

		private int getNext() {
			int retval = arrayInts[next];
			next += 2;
			return retval;

		}

	}

}
