package javatest0501;

import java.util.Scanner;

public class quession9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("商品の単価を入力してください：");
        double price = scanner.nextDouble();

      System.out.println("購入個数を入力してください：");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        double priceDiscount = 0;
        if (total >= 10000) {
            priceDiscount = total * 0.10;
        } else if (total >= 5000) {
            priceDiscount = total * 0.05;
        }

        double quantityDiscount = 0;
        if (quantity >= 5) {
            quantityDiscount = quantity * 100;
        } else if (quantity >= 3) {
            quantityDiscount = quantity * 50;
       }

        double discount = priceDiscount + quantityDiscount;
        double discountedPrice = total - discount;
        double tax = discountedPrice * 0.10;
        double taxIncludedPrice = discountedPrice + tax;

        System.out.println("商品の単価：" + (int)price);
        System.out.println("購入個数：" + quantity);
        System.out.println("割引前の合計金額：" + (int)total);
        System.out.println("割引額：" + (int)discount);
        System.out.println("割引後の価格：" + (int)discountedPrice);
        System.out.println("消費税額：" + (int)tax);
        System.out.println("税込価格：" + (int)taxIncludedPrice);

        scanner.close();
    }
}