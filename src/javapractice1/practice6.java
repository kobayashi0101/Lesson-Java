package javapractice1;
import java.util.Scanner;
public class practice6 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("月の番号を入力してください（1〜12）");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("1月");
                break;
            case 2:
                System.out.println("2月");
                break;
            case 3:
                System.out.println("3月");
                break;
            case 4:
                System.out.println("4月");
                break;
            case 5:
                System.out.println("5月");
                break;
            case 6:
                System.out.println("6月");
                break;
            case 7:
                System.out.println("7月");
                break;
            case 8:
                System.out.println("8月");
                break;
            case 9:
                System.out.println("9月");
                break;
            case 10:
                System.out.println("10月");
                break;
            case 11:
                System.out.println("11月");
                break;
            case 12:
                System.out.println("12月");
                break;
            default:
                System.out.println("不正な値です");
        }

        scanner.close();
    }
}
	
		
		