package homework4;

public class LibraryTester {
	public static void main(String[] args) {
		//spent twenty minutes only to find out that "0" and 'O' are different data types
		
		BookShelf oShelf = new BookShelf('0');
		BookShelf tShelf = new BookShelf('T');
	
		System.out.println(oShelf);
		System.out.println(tShelf);
		
		//copy pasted the same line of code 4 times instead of writing it down 
		Book book1 = new Book("The Heart of the Betrayed", "Crime");
		Book book2 = new Book("Our Hill of Stars", "Fantasy");
        	Book book3 = new Book("One of a Kind", "Science Fiction");
        	Book book4 = new Book("The Vision of Roses", "Romance");
        
        	System.out.println(book1);
        	System.out.println(book2);
        	System.out.println(book3);
        	System.out.println(book4);
        
        	oShelf.addBook(book1); 
        	oShelf.addBook(book2); 
        	oShelf.addBook(book3);
        	oShelf.addBook(book4); 

        	tShelf.addBook(book1); 
        	tShelf.addBook(book2); 
        	tShelf.addBook(book3);
        	tShelf.addBook(book4);
        
        	System.out.println(oShelf);
        	System.out.println(tShelf);
		
	}
}
