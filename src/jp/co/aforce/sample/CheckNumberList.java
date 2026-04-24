package jp.co.aforce.sample;
public class CheckNumberList {
    public static void main(String[] args) {
        int number = 15;
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        boolean isLarge = number > 10;
        if (isLarge) {
            list.add("large");
        } else {
            list.add("small");
        }
        System.out.println(list);
    }
}
