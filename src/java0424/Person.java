package java0424;

public class Person {
    String name;
    int age;

    public void setPerson(String n, int a) {
        name = n;
        age = a;
    }

    public void showPerson() {
        System.out.println("名前：" + name);
        System.out.println("年齢：" + age);
    }
}