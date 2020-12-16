package dec11;

public class testTryCatch {

	public static void main(String[] args) {
		System.out.println("hey");
		
		try {
			System.out.println("try");
			throw new NullPointerException();
		} catch (NullPointerException e) {
			// TODO: handle exception
			try {
				throw new usererror("hey",e);
			} catch (usererror e1) {
				//e1.printStackTrace();
			}
			//System.out.println("catch");
		}
		
		System.out.println("after");
	}
}
