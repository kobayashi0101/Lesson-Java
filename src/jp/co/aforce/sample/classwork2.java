
package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class classwork2 {
   public static void main(String[]args) {
	   Map<String,Integer>fruits = new HashMap<>();
	   
	   fruits.put("りんご",100);
	   fruits.put("みかん",80);
	   fruits.put("バナナ",120);
	   fruits.put("いちご",300);
	   
	   String item = "もやし";

		if(fruits.containsKey(item)) {
			System.out.println(item + "の値段は" + fruits.get(item) + "円です");
		
		}else {System.out.println("申し訳ありませんが、その商品は取り扱っていません。");
		}
   }
   }
