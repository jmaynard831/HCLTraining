package nov20;

public interface Bank {

	public static final int MIN_BAL=30;
	
	public void withdraw();
	
	public void deposit();
	
	default void testing() {
		System.out.println("default method");
	}
	
}
