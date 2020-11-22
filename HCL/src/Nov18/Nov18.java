package Nov18;

public class Nov18 {

	public static void main(String[] args) {
		
		
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		
//		int c = a+b;
//		
//		System.out.println(c);
//		
//		Student sam = new Student();
//		
//		sam.setName("samuel");
//		
//		System.out.println(sam.getName());
//		
//		System.out.println(sam.hashCode());
//		System.out.println(sam);
//		
//		Student mary = new Student("mary", "eight", 2);
//		System.out.println(mary.toString());
//		
//		
//		Employee amar = new Employee();
//		Employee todd = new Employee("bigtodd", "Todd Brown", 65, "math");
//		
//		amar.setDept("comp school");
//		amar.setEmpID("amar001");
//		amar.setEmpName("Amar");
//		amar.setIncome(10000000);
//		
//		System.out.println(amar.toString());
//		System.out.println(todd.toString());
//		
//		
		//Employee reference with Employee Object
		//This is just an Emp object. No connection to manager at all. 
		Employee e = new Employee();
		System.out.println(e.empName);
		//Prints out the inc - 10000
		e.printIncome();
		//Prints out the Emp specific string
		e.JustEmployees();
		//Cannot access manager code!
		//e.justManagers();
		
		System.out.println();
		//Employee reference with Manager Object
		//PARENT p = new CHILD()-  Java THINKS its an emp type,
		//so it can only directly access Emp methods and fields. 
		//But, if theres any overlap in methods that exist in both parent and child,
		//it will use the childs version. 
		//Here, f can only call Emp methods, but when it calls print income,
		//it prints the managers income.
		Employee f = new Manager();
		System.out.println(f.empName);
		f.printIncome();
		f.JustEmployees();
		//f.justManagers();
		
		System.out.println();
		//Manager reference with Manager Object
		//CHILD c = new CHILD() has access to everything it does, and all its parents code. 
		//See: m can access all variables in Emp, and in Man. 
		Manager m = new Manager();
		System.out.println(m.empName);
		System.out.println(m.manName);
		m.printIncome();
		m.JustEmployees();
		m.justManagers();
		
		//Manager ref with Emp Object -- NOT VALID!
		//Manager n = new Employee();
		
		
	}
	
}
