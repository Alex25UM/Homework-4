package homework4;

public class Book {
	String title;
	String genre;
	
	public Book(String title, String genre){
		this.title = title;
		this.genre = genre;
	}
	
	public String getTitle(){
		return title;
	}
	
	@Override
	public String toString(){
		return title;
	}
	

}
