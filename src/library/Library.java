package library;

import java.util.ArrayList;

public class Library {

	
	private ArrayList<Items> libraryContents;
	
	public Library()
	{
		libraryContents = new ArrayList<Items>();
	}
	
	public Items checkOutItem(int itemID) {
		Items toCheckout = null;
		for(Items itemSearch : libraryContents) {
			if(itemID == itemSearch.getItemID())
			{
				toCheckout = itemSearch;
			}
		}
		toCheckout.setAvailable(false);
		libraryContents.remove(toCheckout);
		return toCheckout;
	}
	
	public void checkInItem(Items itemToReturn) {
		if(!itemToReturn.getAvailable()) {
			itemToReturn.setAvailable(true);
			libraryContents.add(itemToReturn);
		}
		
	}
}


