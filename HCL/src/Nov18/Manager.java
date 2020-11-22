package Nov18;

public class Manager extends Employee{
	
	public String manName="Manager";
	public int income=50000;
	
	public void printIncome() {
		System.out.println(income);
	}
	
	public void justManagers() {
		System.out.println("Im a manager!");
	}
	
	

}
