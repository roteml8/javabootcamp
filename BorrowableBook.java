package javabootcamp.oop.library;

public class BorrowableBook extends ReadableBook implements Borrowable {
	
	protected int borrowingPeriod;

	public BorrowableBook(Category category, int quantity, Author author, String title, int borrowingPeriod) {
		super(category, quantity, author, title);
		this.borrowingPeriod = borrowingPeriod;
	}


	@Override
	public void borrowBook() {
		if (inventory > 0)
		{
			System.out.println("The book "+title+" is now borrowed.");
			inventory--;
		}
		else
		{
			System.out.println("The book "+title+" is not available.");
		}
		
	}
	
	@Override
	public void approach()
	{
		System.out.println("--------------");
		System.out.println("The book "+title+" can be read, borrowed and returned.");
		// 1 is for read, 2 is for borrow, 3 is for return
		int action = (int) ((Math.random() * 3) + 1);
		switch (action)
		{
		case 1:
			readBook();
			break;
		case 2:
			borrowBook();
			break;
		default:
			returnBook();
		System.out.println("--------------");
		}
	}



}
