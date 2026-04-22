package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class specialwork {
    public static void main(String[] args) {

        // ① Mapを作る
        Map<String, Integer> nameMap = new HashMap<>();

        // ② データを入れる
        nameMap.put("Bob", 1);
        nameMap.put("Alice", 2);
        nameMap.put("John", 2);
        nameMap.put("Tom", 1);

        // ③ 表示
        System.out.println(nameMap);
    }
}