package jp.co.aforce.practice;

class Animal {
    void speak() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow!");
    }
}

public class quesoin1 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.speak();
    }
}