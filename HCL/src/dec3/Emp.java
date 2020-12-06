package dec3;

import java.io.Serializable;

public class Emp implements Serializable {

	String name;
	int income;
	String email;
	String state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", income=" + income + ", email=" + email + ", state=" + state + "]";
	}
	public Emp(String name, int income, String email, String state) {
		super();
		this.name = name;
		this.income = income;
		this.email = email;
		this.state = state;
	}
	
	
	
}
