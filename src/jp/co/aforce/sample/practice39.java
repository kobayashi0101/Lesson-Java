package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.Arrays;


public class practice39 {
	public static void main(String[]args) {
        // 配列
        Integer[] arr = {1, 2, 3, 4, 5};

        // ArrayListに変換
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // 表示
        for (int num : list) {
            System.out.println(num);
        }
	}
}

