package java0428;

public class Car {
	String model;
	int year;
	
	public Car() {
		this.model = "Unkown";
		this.year = 0;
		
	}
	
	public Car(String model,int year) {
		this.model = model;
		this.year = year;
	}
	public static void maain(String[]args) {
		Car defaltCar = new Car();
		Car specificCar = new Car("Toyota",2022);
		
		System.out.println("デフォルトカー:" + defaltCar.model + "," + defaltCar.year);
		System.out.println("特定カー:" + specificCar.model + "," + specificCar.year);
	
	}

}
