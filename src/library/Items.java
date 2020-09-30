package library;

public abstract class Items {

	private static int itemID;
	private boolean isAvailable = true;
	private String itemDescription;
	
	public Items()
	{
		setItemID(-99);
		setAvailable(false);
		setDescription("");
	}
	
	public Items(int iD, String desc) {
		setItemID(iD);
		setAvailable(true);
		setDescription(desc);
	}
	
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
	
	public String getDescription()
	{
		return this.itemDescription;
	}
	
	public void setDescription(String description) {
		this.itemDescription = description;
	}
	
	
	
}
