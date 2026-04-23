package javapractice1;
public class practice3 {
	public static void main(String[]args) {
		 int a;
	        int b;
	        int c;

	        // ② 値の代入（自分で決める）
	        a = 3;
	        b = 4;
	        c = 5;

	        // ③ 判定
	        if (a + b > c && a + c > b && b + c > a) {
	            System.out.println("三角形は作れます");
	        } else {
	            System.out.println("三角形は作れません");
	        }
	    }
	}