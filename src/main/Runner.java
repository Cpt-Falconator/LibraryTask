package main;

import humans.Person;
import items.Book;
import items.Maps;
import library.Items;
import library.Library;

public class Runner {

	public static void main(String[] args) {
		
		Library falconCollection = new Library();
		
		Person person1 = new Person("Lewis");
		falconCollection.registerPerson(person1);
		
		Items item1 = new Book(falconCollection.getCollectionSize(),"A fitting tale of game development", "Diary of a Game Dev", "Falcon Nest Interactive");
		falconCollection.addItem(item1);
		
		Items item2 = new Maps(falconCollection.getCollectionSize(),"Map of middle earth", 1982, true);
		
		falconCollection.addItem(item2);
		
		
		
		person1.requestItem(falconCollection, 0);
		
	}

}
