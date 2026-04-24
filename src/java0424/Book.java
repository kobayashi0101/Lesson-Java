package java0424;

public class Book {
	String title;
	String author;
	int price;
	
	public void  setBook(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}
	public void showInfo() {
		System.out.println("タイトル:" + title);
		System.out.println("著者:" + author);
		System.out.println("価格" + price + "円");
		
	}

}
