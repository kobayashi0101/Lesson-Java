package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest5 {

    public static void main(String[] args) {

        // ===== 問題1 =====
        Random rand = new Random();
        int fortune = rand.nextInt(4) + 1;

        System.out.println("乱数: " + fortune);

        switch (fortune) {
            case 1:
                System.out.println("吉です");
                break;
            case 2:
                System.out.println("中吉です");
                break;
            case 3:
                System.out.println("大吉です");
                break;
            default:
                System.out.println("凶です");
        }

        // ===== 問題2 =====
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i);
                count++;

                if (count < 100 / 7) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();

        // ===== 問題3（九九）=====
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // ===== 問題4 =====
        int num = 10; // 任意の値

        for (int i = num; i <= num * 9; i += num) {
            for (int j = num; j <= num * 9; j += num) {
                System.out.print(i * j / num + "\t");
            }
            System.out.println();
        }

        // ===== 問題5 =====
        ArrayList<String> employees = new ArrayList<>();
        employees.add("斎藤");
        employees.add("田中");
        employees.add("山田");
        employees.add("鈴木");
        employees.add("高橋");

        ArrayList<String> submitters = new ArrayList<>();
        submitters.add("斎藤");
        submitters.add("高橋");

        for (String emp : employees) {
            if (!submitters.contains(emp)) {
                System.out.println(emp);
            }
        }

        // ===== 問題6（素数）=====
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}