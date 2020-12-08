package dec8;

import java.util.Comparator;

public class EmpNameCompartor implements Comparator<Employee>{

	@Override
	public int compare(Employee a, Employee b) {
		return a.getEmpname().compareToIgnoreCase(b.getEmpname());
	}

}
