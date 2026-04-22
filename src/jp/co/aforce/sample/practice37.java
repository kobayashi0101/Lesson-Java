package jp.co.aforce.sample;
import java.util.HashMap;
import java.util.Map;


public class practice37 {
	public static void main(String[]args) {
		  Map<String, Integer> map = new HashMap<>();

	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);

	        String key = "B";

	        if (map.containsKey(key)) {
	            System.out.println(map.get(key));
	        } else {
	            System.out.println("キーが存在しません");
		
	}

   }
}
