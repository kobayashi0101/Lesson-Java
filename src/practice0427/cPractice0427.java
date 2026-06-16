package practice0427;
public class cPractice0427{
	public static void main(String[]args) {
		
		main1 p1 = new main1();
		main1 p2 = new main1();
		
		System.out.println("初期状態");
		System.out.println("p1.hp=" + p1.hp1);
		System.out.println("p2.hp=" + p2.hp2);
		
		p1.hp1-= 30;
		
		System.out.println("\nダメージ後:");
		System.out.println("p1.hp=" + p1.hp1);
		System.out.println("p2.hp =" + p2.hp2);
	}
}