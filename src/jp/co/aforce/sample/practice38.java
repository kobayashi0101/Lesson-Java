package jp.co.aforce.sample;
import java.util.HashSet;


public class practice38 {
	public static void main(String[]args) {
		
		HashSet<String>set = new HashSet<>();
		
        set.add("Java");
        set.add("Python");
        set.add("Java");
        set.add("Ruby");
        set.add("Python");

        System.out.println(set);
	}

}
