package datatypes;

public class PrimitiveAndObject {
    public static int x = 100;

    public static Integer y = Integer.valueOf(x);

    public static void main(String[] args) {
        System.out.println(PrimitiveAndObject.y.byteValue());
    }
}
