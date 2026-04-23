package javapractice1;

import java.util.Scanner;

public class practice7 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("成績を入力してください（A, B, C, D, F）");
        String grade = scanner.next();

        switch (grade) {
            case "A":
                System.out.println("優秀です");
                break;
            case "B":
                System.out.println("良いです");
                break;
            case "C":
                System.out.println("普通です");
                break;
            case "D":
                System.out.println("もう少し頑張りましょう");
                break;
            case "F":
                System.out.println("不合格です");
                break;
            default:
                System.out.println("不正な値です");
        }

        scanner.close();
    }
}

