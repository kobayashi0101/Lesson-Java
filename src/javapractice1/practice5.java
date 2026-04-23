package javapractice1;
import java.util.Scanner;
public class practice5 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("日曜の番号を入力してください(1～7)");
		int num = scanner.nextInt();

		
		switch(num){
			case 1:
			System.out.println("月曜日");
			break;
			case 2:
			
			System.out.println("火曜日");
			break;
			case 3:
			
			System.out.println("水曜日");
			break;
			case 4:
			
			System.out.println("木曜日");
			break;
			case 5:
			
			System.out.println("金曜日");
			break;
			case 6:
			
			System.out.println("日曜日");
			break;
		default:
			System.out.println("不正な値です");
		}
		scanner.close();
	}
	}


