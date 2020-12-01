package nov24;

import java.util.Comparator;

public class EmpidComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp arg0, Emp arg1) {
		// TODO Auto-generated method stub
		return arg0.getID()-arg1.getID();
	}

}
