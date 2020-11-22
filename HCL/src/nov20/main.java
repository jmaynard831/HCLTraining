package nov20;

public class main {

	public static void main(String args[]) {
		// abstractParent abs = new absChild();

		// Bank b = new publicBank();
		// b.deposit();
		// b.testing();

		Guest amar = new Guest("Amar");
		System.out.println(amar.toString());
		amar.eatVegMeal();
		System.out.println(amar.toString());
		amar.eatStarters();
		System.out.println(amar.toString());
	}
	
}
