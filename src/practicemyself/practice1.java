package practicemyself;

public class practice1 {
	public static void main(String[]args) {
		final double TAX = 1.1;
		System.out.println("消費税:" + TAX);
		
		int x = 480;
		double price = x * TAX;
		System.out.println("税込み価格" + price);
		
		String name = "KEi";
		System.out.println("名前" + name);
		
		String text1 = "この商品の値段は";
		String text2 = "円です";
		System.out.println(text1 + price + text2);
		
		
	}
	

}
