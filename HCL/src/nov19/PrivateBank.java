package nov19;

public class PrivateBank extends Bank {

	int insurance;
	int creditcard;
	
	public void deposit() {
		System.out.println("PRIVATE DEPOSIT CALLED");
	}
	
	public int withdraw() {
		System.out.println("PRIVATE WITHDRAW CALLED");
		return 0;
	}
	
	public void privateBank() {
		System.out.println("only private");
	}
	
}

