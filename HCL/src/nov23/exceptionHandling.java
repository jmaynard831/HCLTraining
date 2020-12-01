package nov23;

public class exceptionHandling {

	public static void main(String [] args) {
		
		try {
			int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]);
			
			int c = b/a;
			System.out.println("test");
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("no divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("no such array pos");
		}
		finally {
			System.out.println("sds");
		}
		
	}
	
	
	
}
