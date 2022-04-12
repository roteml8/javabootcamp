package javabootcamp.oop.library;

public class ReadableBook extends Book {
	
	public ReadableBook(Category category, int quantity, Author author, String title)
	{
		super(category, quantity,author, title);
	}

	@Override
	public void readBook() {
		if (inventory > 0)
		{
			System.out.println("The book "+this.title+" is being read.");
			inventory--;
		}
		else
			System.out.println("The book "+title+" is not available");
		
	}

	@Override
	public void returnBook() {

		inventory++;
		System.out.println("The book "+title+" was returned.");

	}

	@Override
	public void approach() {
		System.out.println("--------------");
		System.out.println("The book "+title+" can be read and returned.");
		// 1 is for read, 2 is for return
		int action = (int) ((Math.random() * 2) + 1);
		if (action == 1)
			readBook();
		else
			returnBook();
		System.out.println("--------------");
		
	}

}
