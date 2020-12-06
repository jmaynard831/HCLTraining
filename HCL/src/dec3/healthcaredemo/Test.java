package dec3.healthcaredemo;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Manager Test
		Employee e = new Manager(7);
		System.out.println(e.salary());
		Medical m = new Manager(7);
		System.out.println(m.medicalCoverage());
		
		// Permanent Emp
		
		TechnicalAssociate ts = new PermanentTechAssociate(7,10);
		System.out.println(ts.salary());
		
		Medical m1 = new PermanentTechAssociate(7,10);
		System.out.println(m1.medicalCoverage());
		
		Employee e1 = new PermanentTechAssociate(7,10);
		System.out.println(e1.salary());
		
		
		// Contract Employee
		TechnicalAssociate cs = new ContractTechAssociate(10,10);
		System.out.println("!!contract!"+cs.salary());
		
		Employee ecs = new ContractTechAssociate(10,10);
		System.out.println("!!!!"+ecs.salary());
	}

}
