package stringhandling;

public class Immutable {

    int id;

    String name;

    Immutable(int id, String name){
        this.id  = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Immutable user = new Immutable(12,"name");

        System.out.println(user);

        String s = new String("s");

        System.out.println(s);
    }
}
