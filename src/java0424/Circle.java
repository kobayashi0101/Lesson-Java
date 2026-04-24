package java0424;

public class Circle {
	double radius;
	
	public Circle(double r) {
		radius = r;
	}
	public void showArea() {
		double area = Math.PI * radius * radius;
		System.out.println("半径:" + radius);
		System.out.println("面積:" + area);
	}

}
