package java0424;

public class Main1 {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.setPerson("田中", 20);
        p2.setPerson("佐藤", 25);

        p1.showPerson();
        p2.showPerson();
    }
}