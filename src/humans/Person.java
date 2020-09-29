package humans;

import java.util.ArrayList;

import library.Items;
import library.Library;

public class Person {
	private ArrayList<Items> personalCollection;
	
	//Add check here incase item is not valid to check out
	public void requestItem(Library library, int itemID) {
		personalCollection.add(library.checkOutItem(itemID));
	}
	
	public void returnItem(Library library, int itemID)
	{
		Items itemToReturn = null;
		for(Items itemSearch : personalCollection) 
		{
			if(itemID == itemSearch.getItemID())
			{
				itemToReturn = itemSearch;
			}
		}
		personalCollection.remove(itemToReturn);
		library.checkInItem(itemToReturn);
	}
}
