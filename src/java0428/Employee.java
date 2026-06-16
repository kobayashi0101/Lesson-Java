package java0428;

public class Employee{
	String name;
	int id;
	
	public Employee(String name,int id) {
		this.name = name;
		this.id =id;
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)return true;
		if(obj == null || getClass()!= obj.getClass())return false;
		Employee employee = (Employee)obj;
		return id == employee.id;
	}
	public static void main(String[]args) {
		Employee emp1 = new Employee("John",101);
		Employee emp2 = new Employee("Jane",102);
		Employee emp3 = new Employee("John",101);
		
		System.out.println(emp1.equals(emp2));//fase
		System.out.println(emp1.equals(emp3));//true
	}
}