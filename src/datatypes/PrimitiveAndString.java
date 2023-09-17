package datatypes;

import java.util.Arrays;
import java.util.List;
public class PrimitiveAndString {

    public static void main(String[] args) {
        byte x = 100;

        String s = Byte.toString(x);

        byte y = Byte.parseByte(s);

        System.out.println(y);

        List <String> l = List.of("hello");

        List<String> l2 = Arrays.asList("hello");

        System.out.println();
    }
}
