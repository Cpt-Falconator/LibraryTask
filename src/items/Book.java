package items;

import library.Items;

public class Book extends Items {
	private String title;
	private String author;
	
	public Book()
	{
		super();
		setTitle("");
		setAuthor("");
	}
	
	public Book(int iD, String desc, String title, String author) {
		super(iD, desc);
		setTitle(title);
		setAuthor(author);
	}
	private void setTitle(String title) {
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	
	private void setAuthor(String author) {
		this.author = author;
	}
	private String getAuthor(){
		return this.author;
	}
}
