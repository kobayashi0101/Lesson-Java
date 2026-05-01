package javatest0501;
import java.util.ArrayList;

public class quession8{
	public static void main(String[]args) {
		ArrayList<String>fruits = new ArrayList<>();
		
		fruits.add("りんご");
		fruits.add("ばなな");
		fruits.add("さくらんぼ");
		
		fruits.remove("ばなな");
		fruits.add("オレンジ");
		
		System.out.println(fruits);
		
	}
}


