package nov20;

public class Guest implements VegMeal, Starters, Desserts, Nonveg, FourCourse {

	String guestName;
	double guestBill;

	Guest(String name) {
		this.guestName = name;
	}

	@Override
	public String toString() {
		return guestName + " has spent $" + guestBill;
	}

	@Override
	public void eatFourCourse() {
		// TODO Auto-generated method stub
		this.guestBill+=Guest.FOUR_COURSE_COST;
	}

	@Override
	public void eatNonveg() {
		// TODO Auto-generated method stub
		this.guestBill+=Guest.NONVEG_COST;
	}

	@Override
	public void eatDess() {
		// TODO Auto-generated method stub
		this.guestBill+=Guest.DESSERTS_COST;
	}

	@Override
	public void eatStarters() {
		// TODO Auto-generated method stub
		this.guestBill+=Guest.STARTERS_COST;
	}

	@Override
	public void eatVegMeal() {
		// TODO Auto-generated method stub
		this.guestBill+=Guest.VEG_MEAL_COST;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
