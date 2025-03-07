package homework4;
import java.util.ArrayList;

public class BookShelf {
	//String shelfLetter;
	private char shelfLetter;
	private ArrayList<Book> bookList;
	
	public BookShelf(char shelfLetter){
		this.shelfLetter = shelfLetter;
		this.bookList = new ArrayList<>();
	}
	
	public char getLetter() {
		return shelfLetter;
	}
	
	public ArrayList<Book> getBooks(){
		return bookList;
	}
	
	public void addBook(Book book){
		if (bookList.size() < 8) {
			// had to google how to do this because my first instinct was book.title[0]
			if (book.title.charAt(0) == shelfLetter) {
				bookList.add(book);
			} else {
				return;
			}
		} else {
			return;
		}
	}
	
	public void removeBook(Book book){
		bookList.remove(book);
	}
	
	@Override
	public String toString() {
		String returnString = "";
		if (bookList.isEmpty()) {
			returnString = "Empty!";
		} else {
			for(int i = 0; i < bookList.size(); i++) {
				returnString += bookList.get(i) + "   ";
			}
		}
		
		return returnString;
	}
	

}
