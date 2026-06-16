package practicemyself;

import java.util.ArrayList;
import java.util.Collections;

public class practice2 {

    public static void main(String[] args) {

        // 問題1
        String[] products = {
            "シャープペンシル",
            "ボールペン",
            "リングノート",
            "クリップ",
            "消しゴム"
        };

        // 問題2
        System.out.println(products[1]);
        
        ArrayList<String>employees = new ArrayList<>();
        
        employees.add("山田太郎");
        employees.add("鈴木花子");
        employees.add("佐藤二郎");
        employees.add("山田太郎");
        employees.add("高橋三郎");
        
        System.out.println(employees.get(2));
        
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(16);
        list1.add(19);
        
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(18);
        list2.add(20);
        
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        
        Collections.sort(mergedList);
        
        for(Integer num: mergedList) {
        	System.out.println(num);
        }
        
        ArrayList<Integer>list3 = new ArrayList<>();
        list3.add(13);
        list3.add(14);
        list3.add(17);
        list3.add(21);
        
        int i =0;
        int j =0;
        
        while(i< list1.size() && j < list3.size()) {
        	if(list1.get(i) < list3.get(j)) {
        		System.out.println(list1.get(i));
        		j++;
        	}
        }
        while(i < list1.size()) {
        	System.out.println(list1.get(i));
        	i++;
        }
        while(j< list3.size()) {
        	System.out.println(list3.get(j));
        	j++;
        }
    }
}