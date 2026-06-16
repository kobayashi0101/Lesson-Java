package java0424;

public class main2 {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.setBook("JAava入門","山田",3000);
		b2.setBook("プログラミング基礎","佐藤",2500);
		
		b1.showInfo();
		b2.showInfo();
	}

}
