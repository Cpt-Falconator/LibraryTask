package library;

public abstract class Items {

	private static int itemID;
	private boolean isAvailable = true;
	
	public int getItemID() {
		return this.itemID;
	}
	
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	public boolean getAvailable() {
		return this.isAvailable;
	}
	
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
}
