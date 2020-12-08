package dec8;

public class Employee {

	private String empname;
	private String email;
	private String 	city;
	
	public Employee(String empname, String email, String city) {
		super();
		this.empname = empname;
		this.email = email;
		this.city = city;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", email=" + email + ", city=" + city + "]";
	}
	
	
}
