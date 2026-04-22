package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.Collections;


public class practice34 {
	public static void main(String[]args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("banana");
		list.add("apple");
		list.add("orange");
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
