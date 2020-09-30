package humans;

import java.util.ArrayList;

import library.Items;
import library.Library;

public class Person {
	private String name;
	private ArrayList<Items> personalCollection;
	
	public Person() {
		setName("");
		personalCollection = new ArrayList<Items>();
	}
	
	public Person(String name) {
		setName(name);
		personalCollection = new ArrayList<Items>();
	}
	
	//Add check here incase item is not valid to check out
	public void requestItem(Library library, int itemID) {
		personalCollection.add(library.checkOutItem(itemID));
		System.out.println(this.name = " has the following items from the library;");
		for(Items owned : personalCollection)
		{
			System.out.println(owned.getDescription());
		}
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
	
	private void setName(String name) {
		this.name = name;
	}
	
	private String getName() {
		return this.name;
	}
}
