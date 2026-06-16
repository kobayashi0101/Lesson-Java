package jp.co.aforce.practice;

public class PracticeTest2 {

    public static void main(String[] args) {

        // 問題1（定数）
        final double TAX = 1.1; // 消費税10%

        System.out.println("消費税率: " + TAX);

        // 問題2
        int x = 480;
        double price = x * TAX;
        System.out.println("税込価格: " + price);

        // 問題3
        String name = "Naoto"; // 自分の名前に変えてOK
        System.out.println("名前: " + name);

        // 問題4
        String text1 = "この商品の値段は";
        String text2 = "円です";

        System.out.println(text1 + price + text2);
    }
}