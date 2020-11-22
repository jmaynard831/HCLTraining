package nov20;

public class RoomService {

	private Kitchen kitchen;

	public RoomService(Kitchen k) {
		this.kitchen = k;
	}

	public void takeOrder(String food) {
		System.out.print("Customer has ordered " + food+" from ");
		kitchen.prepareFood();
	}

}
