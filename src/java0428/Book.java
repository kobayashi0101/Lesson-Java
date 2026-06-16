package java0428;

public class Book {
	String title;
	String actor;
	double price;
	
	public Book(String title,String actor, double price) {
		this.title = title;
		this.actor = actor;
		this.price = price;
	}
	public Book(String title,String actor) {
		this(title,actor,0.0);
	}
	public static void main(String[]args) {
		Book book1 = new Book("Jave programming","john doe",29.99);
		Book book2 = new Book("Python Programing","Jane Doe");
		
		System.out.println("Book1:" + book1.title + "," + book1.actor + ",$" + book1.price);
		System.out.println("Book2:" + book2.title + "," + book2.actor + ",$" + book2.price);
		
	}
	
}
