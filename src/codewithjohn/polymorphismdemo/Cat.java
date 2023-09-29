package codewithjohn.polymorphismdemo;

public class Cat extends Animal {

    String name = "Tom";

    @Override
    public void eat() {
        System.out.println("yum yum");
    }


    public void eat(int numberOfTimes) {
        int i = 0;
        while (i < numberOfTimes) {
            System.out.println("yum yum");
            i++;
        }
    }

    public String getName() {
        return this.name;
    }
}
