package stringhandling;

public class StringMethods {


    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(s.length());
        System.out.println("Index of " + s.indexOf('o'));
        System.out.println("charAt " + s.charAt(1));

        System.out.println("Substring " + s.substring(2));
        System.out.println("Substring begin and end index " + s.substring(0,3));

        String[] r =  s.split(" ");

        for (String string : r) {
            System.out.print(string);
        }

    }
}
