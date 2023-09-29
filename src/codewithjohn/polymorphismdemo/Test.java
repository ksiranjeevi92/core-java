package codewithjohn.polymorphismdemo;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();;

        Dog dog = new Dog();

        Cat cat = new Cat();

        dog.eat();

        cat.eat();;

        cat.eat(3);
    }
}
