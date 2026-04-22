package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.HashSet;


public class practice32 {
	public static void main(String[]args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		HashSet<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
		
	}

}
