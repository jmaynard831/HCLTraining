package dec3.healthcaredemo;

public class Manager implements Employee, Medical{
	private int year;
	public Manager(int year){
		this.year=year;
	}
	
	public int medicalCoverage(){
	
		return (salary());
	}
	
	
 public int salary(){
	 
	 return year* 10000;
 }

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

}
