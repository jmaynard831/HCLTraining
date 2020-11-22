package nov19;

public class assign2cont {

	
	public static void main(String args[]) {
		for(int i=0; i<5;i++) {
			for(int j =0; j<10; j++) {
				System.out.println(j+"\t");
				if(j>5) {
					System.out.println();
					continue;
				}
			}
			System.out.println("outer loop");
		}
		System.out.println("end");
	}
	
}
