package java0424;

public class Employee {
    int id;          // ← intに修正
    String name;
    double salary;

    public void setEmployee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    public void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100);
    }

    public void showInfo() {
        System.out.println("ID：" + id);
        System.out.println("名前：" + name);
        System.out.println("給与：" + salary);
    }
}
