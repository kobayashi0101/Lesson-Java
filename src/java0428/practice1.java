package java0428;

public class practice1 {
	String name;
	int age;
	
	public practice1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
    public static void main(String[] args) {
         practice1 practice1 = new practice1("Alice", 30);
        System.out.println("名前: " + practice1.name + ", 年齢: " + practice1.age);
    }
}

