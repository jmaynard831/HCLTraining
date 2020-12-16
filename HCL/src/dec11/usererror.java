package dec11;

public class usererror extends Throwable{

	public usererror(String error, Throwable e) {
		super(error,e);
		System.out.println("whoopsie error");
	}
	
}
