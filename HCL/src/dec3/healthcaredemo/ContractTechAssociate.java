package dec3.healthcaredemo;

public class ContractTechAssociate extends TechnicalAssociate{
	
	private int wage;
	private int hour;
	private int amount;
	
	public ContractTechAssociate(int wage, int hour){
		this.wage= wage;
		this.hour= hour;
	}
	
	public int salary(){
		if(hour <= 40){
			amount = wage * hour;
		}else{
			amount = 40 * wage + (hour -40)* wage *2;
		}
		
		return amount;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
