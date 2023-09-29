package codewithjohn.polymorphismdemo;

public class Dog extends Animal {
    String name = "Courage";

    @Override
    public void eat(){
        System.out.println("hmm");
    }

    public String getName() {
        return this.name;
    }
}
