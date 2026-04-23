package javapractice1;
import java.util.Scanner;
public class practice2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int num = scanner.nextInt();
		if(num > 0) {
			System.out.println("正の数です");
		}else {
			System.out.println("負の数です");
		}
	}

}
