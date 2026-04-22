package jp.co.aforce.sample;
import java.util.ArrayList;

public class practice33 {
	public static void main(String[]args) {
		
		ArrayList<Integer>list = new ArrayList<>();
			
		list.add(10);
		list.add(20);
		list.add(30);
		
		int target = 20;
		
		if(list.contains(target)) {
			System.out.println("含まれています");
		}else {
			System.out.println("含まれていません");
		}
		
	}

}
