package nov25;

public class Test {
	public static int[ ] getArray() {  return null;  }

	public static void main(String[] args){       
		int index = 1;
		try{          
			int [] x = new int[4];
			
			//x[index=5]++;
			//getArray()[index=2]++;
		}
		catch (Exception e){  }  //empty catch       
		System.out.println("index = " + index);    
		}
	}
	