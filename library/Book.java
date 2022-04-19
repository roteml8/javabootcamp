package javabootcamp.oop.library;

public abstract class Book implements Readable { 
	
	protected Category category;
	protected int quantity;
	protected Author author;
	protected String title;
	protected int inventory;
	
	
	public Book(Category category, int quantity, Author author, String title) {
		this.category = category;
		this.quantity = quantity;
		this.author = author;
		this.title = title;
		this.inventory = quantity;
	}

	public abstract void approach();


	public enum Category {
		COOKING,
		NOVEL,
		DICTIONARY;
	}

}
