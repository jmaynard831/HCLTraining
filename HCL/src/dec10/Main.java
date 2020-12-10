package dec10;

public class Main {

	public static void execute(int[] a, intFunction i) {
		for (int is : a) {
			i.applyAsDouble(is);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };

		execute(arr, new intFunction() {
			@Override
			public void applyAsDouble(int i) {
			}
		});

		execute(arr, (x) -> System.out.println(x));

	}

}
