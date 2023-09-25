package stringhandling;

public class StringPoolDemo {
    public static void main(String[] args) {
        Immutable user1  = new Immutable(12,"u");
        Immutable user2  = new Immutable(13,"u");

        System.out.println(user1);
        System.out.println(user2);

        String s1 = "abc";

        String s2 = "abc";

        String s3 = "ABC";

        System.out.println(s1.hashCode());

        System.out.println(s2.hashCode());

        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2));

    }
}
