package nov19;

public class UserType {

	String name;
	UserType(String name){
		this.name = name;
	}
	
	UserType(){
		this("student");
	}
	
	public static void main(String args[]) {
		UserType x = new UserType("Faculty");
		UserType y = new UserType();
		
		System.out.println(x.name);
		System.out.println(y.name);
		
		
	}
	
	
}
