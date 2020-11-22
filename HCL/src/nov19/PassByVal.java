package nov19;

public class PassByVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sId= 25;
		
		PassByVal pbv = new PassByVal();
		System.out.println(sId);
		
		pbv.passTheValueMethod(sId);
		
		System.out.println("in main: "+sId);
		
	}

	public void passTheValueMethod(int sId) {
		sId=10;
		System.out.println("in method"+sId);
	}
	
}
