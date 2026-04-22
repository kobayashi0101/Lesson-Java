package jp.co.aforce.sample;
import java.util.HashMap;
import java.util.Map;

public class practice36 {
	public static void main(String[]args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		
		for(String key :map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
			
	}
			

}
