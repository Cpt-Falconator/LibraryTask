package library;

import java.util.ArrayList;

import humans.Person;

public class Library {

	private int collectionSize;
	private ArrayList<Items> libraryContents;
	private ArrayList<Person> registeredCustomers;
	
	public Library()
	{
		super();
		collectionSize = 0;
		libraryContents = new ArrayList<Items>();
		registeredCustomers = new ArrayList<Person>();
	}
	
	public Items checkOutItem(int itemID) 
	{
		Items toCheckout = null;
		for(Items itemSearch : libraryContents) 
		{
			if(itemID == itemSearch.getItemID()-1)
			{
				toCheckout = itemSearch;
				break;
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
		collectionSize++;
	}
	
	public int getCollectionSize()
	{
		return this.collectionSize;
	}
	
	public void registerPerson(Person person)
	{
		registeredCustomers.add(person);
	}
}


