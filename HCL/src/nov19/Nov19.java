package nov19;

public class Nov19 {

//	static int a = 3;
//	static int b;
//
//	static {
//		System.out.println("static block");
//		b = a * 4;
//	}
//
//	static void calculate(int x) {
//		System.out.println(x);
//		System.out.println(a);
//		System.out.println(b);
//	}
//
	public static void main(String[] args) {
		//calculate(22);
		
		//parent p = new parent(1,2);
		
		//baby b = new baby(1,2,3);
		
		Bank bank = new Bank();
		bank.deposit();
		bank.withdraw();
		
		PublicBank pb = new PublicBank();
		pb.deposit();
		pb.withdraw();
		pb.pubBank();
		
		PrivateBank priBank = new PrivateBank();
		priBank.deposit();
		priBank.withdraw();
		priBank.privateBank();
	}

	
	
	
	
	
	
}
