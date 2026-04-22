package jp.co.aforce.sample;
import java.util.ArrayList;

public class practice40 {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();

	        list.add("Java");
	        list.add("Python");
	        list.add("Ruby");

	        // 配列に変換
	        String[] arr = list.toArray(new String[0]);

	        // 表示
	        for (String str : arr) {
	            System.out.println(str);
	        }
	    }
	
	}

