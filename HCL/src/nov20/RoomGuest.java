package nov20;

public class RoomGuest {

	
	public static void main(String args[]) {
		
		RoomService rm = new RoomService(new ItalianKitchen());
		rm.takeOrder("biryani");
		
		RoomService rm2 = new RoomService(new ItalianKitchen());
		rm2.takeOrder("caprese salad");
		
		RoomService rm3 = new RoomService(new EuroKitchen());
		rm3.takeOrder("gyro");
		
		RoomService rm4 = new RoomService(new JPKitchen());
		rm4.takeOrder("one of those wiggly pancakes");
		
		
	}
	
}
