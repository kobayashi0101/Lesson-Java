package java0428;

class Animal {
    public void makeSound() {
        System.out.println("動物の音");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("ワンワン");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("ニャーニャー");
    }
}




