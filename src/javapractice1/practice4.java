package javapractice1;

public class practice4 {
	public static void main(String[]args) {
		int age;
		age = 34;
		
		if(age <= 12)
			{System.out.println("無料");
	}
		else if(age >= 13 && age < 59) {
			System.out.println("1000円");
		}else if(age >=60) {
			System.out.println("500円");
		}
}}
