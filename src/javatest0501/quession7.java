package javatest0501;
import java.util.Scanner;
public class quession7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("年齢を入力してください：");
	        int age = scanner.nextInt();
	     
	    

	        if (age < 0 || age > 120) {
	            System.out.println("エラー：不正な年齢です");
	        } else if (age <= 3) {
	            System.out.println("入場料は0円です");
	        } else if (age <= 12) {
	            System.out.println("入場料は500円です");
	        } else if (age <= 17) {
	            System.out.println("入場料は800円です");
	        } else if (age <= 59) {
	            System.out.println("入場料は1200円です");
	        } else {
	            System.out.println("入場料は700円です");
	        }
	        scanner.close();
	    }
	}


