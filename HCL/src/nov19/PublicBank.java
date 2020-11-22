package nov19;

public class PublicBank extends Bank{

	String lockerFacility;
	
	int MutualFunds;

	
	public void deposit() {
		System.out.println("Public Deposit called");
	}
	
	public int withdraw() {
		System.out.println("public Withdraw called");
		return 0;
	}
	
	public void pubBank() {
		System.out.println("only public");
	}
	
}
