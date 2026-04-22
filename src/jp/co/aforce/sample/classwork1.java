package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.List;

public class classwork1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);
        list.add(2, 2);
        list.add(5);
        list.add(6);
        list.remove(3);

        System.out.println(list);

        list.set(2, 4);

        System.out.println(list);

        list.clear();

        System.out.println(list);
    }
}