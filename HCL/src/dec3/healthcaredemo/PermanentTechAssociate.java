package dec3.healthcaredemo;

public class PermanentTechAssociate extends TechnicalAssociate implements Medical {
	private int year;
	private int noOfCertification;
	
	public PermanentTechAssociate(int year, int noOfCertification ){
		this.year = year;
		this.noOfCertification = noOfCertification;
	}
	
	
	public int salary(){
	
		return (year * 5000 + noOfCertification * 1000);
	}
	
	
	public int medicalCoverage(){
		
		return (salary() * 2);
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getNoOfCertification() {
		return noOfCertification;
	}


	public void setNoOfCertification(int noOfCertification) {
		this.noOfCertification = noOfCertification;
	}

}
