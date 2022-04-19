package javabootcamp.oop.library;

import javabootcamp.oop.library.Book.Category;

public class Library {

	public static void main(String[] args) {
		Book[] books = new Book[6];
		books[0] = new BorrowableBook(Category.COOKING, 120, new Author("Rotem",'f'),"Cooking", 10);
		books[1] = new PurchasableBook(Category.DICTIONARY, 120, new Author("Rotem",'f'),"Oxford", 10, 100);
		books[2] = new PurchasableBook(Category.DICTIONARY, 50, new Author("Rotem",'f'),"Oxford2", 10, 100);
		books[3] = new BorrowableBook(Category.NOVEL, 120, new Author("Rotem",'f'),"Hello World", 10);
		books[4] = new ReadableBook(Category.NOVEL, 50, new Author("Matan",'m'),"My Novel");
		books[5] = new ReadableBook(Category.COOKING, 50, new Author("Matan",'m'),"My Cooking");
		for (int i = 0; i < books.length; i++) {
			books[i].approach();
			
		}

		


	}

}
