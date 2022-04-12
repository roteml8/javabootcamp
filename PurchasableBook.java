package javabootcamp.oop.library;

public class PurchasableBook extends BorrowableBook implements Purchasable {
	
	protected int price;

	public PurchasableBook(Category category, int quantity, Author author, String title, int borrowingPeriod,
			int price) {
		super(category, quantity, author, title, borrowingPeriod);
		this.price = price;
	}

	@Override
	public void purchaseBook() {
		if (inventory > 0)
		{
			System.out.println("The book "+title+" was purchased.");
			inventory--;
		}
		else
			System.out.println("The book "+title+" is not available");
		
	}
	
	@Override
	public void approach()
	{
		System.out.println("--------------");
		System.out.println("The book "+title+" can be read, borrowed, purchased and returned.");
		// 1 is for read, 2 is for borrow, 3 is for purchase, 4 is for return
		int action = (int) ((Math.random() * 4) + 1);
		switch (action)
		{
		case 1:
			readBook();
			break;
		case 2:
			borrowBook();
			break;
		case 3:
			purchaseBook();
			break;
		default:
			returnBook();
		System.out.println("--------------");
		
		}
	}
	
	

}
