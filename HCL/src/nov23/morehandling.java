package nov23;

public class morehandling {

	public static void we() {
		try {
		throw new NullPointerException("error!");
		}
		catch(NullPointerException e ) {
			System.out.println("its cool");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		we();
	}

}
