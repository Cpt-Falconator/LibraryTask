package library;

import java.util.ArrayList;

public class Library {

	private int collectionSize;
	private ArrayList<Items> libraryContents;
	
	public Library()
	{
		collectionSize = 0;
		libraryContents = new ArrayList<Items>();
	}
	
	public Items checkOutItem(int itemID) 
	{
		Items toCheckout = null;
		for(Items itemSearch : libraryContents) 
		{
			if(itemID == itemSearch.getItemID())
			{
				toCheckout = itemSearch;
			}
		}
		toCheckout.setAvailable(false);
		libraryContents.remove(toCheckout);
		return toCheckout;
	}
	
	public void checkInItem(Items itemToReturn) 
	{
		if(!itemToReturn.getAvailable()) 
		{
			itemToReturn.setAvailable(true);
			libraryContents.add(itemToReturn);
		}
		
	}
	
	public void addItem(Items itemToAdd)
	{
		libraryContents.add(itemToAdd);
		setCollectionSize();
	}
	
	public int getCollectionSize()
	{
		return this.collectionSize;
	}
	
	public void setCollectionSize() 
	{
		collectionSize++;
	}
}


