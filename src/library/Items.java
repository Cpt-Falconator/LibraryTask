package library;

public abstract class Items {

	private static int itemID;
	private boolean isAvailable = true;
	
	public void checkOut() {
		this.isAvailable = false;
	}
	
	public void checkIn() {
		this.isAvailable = true;
	}
	
}
