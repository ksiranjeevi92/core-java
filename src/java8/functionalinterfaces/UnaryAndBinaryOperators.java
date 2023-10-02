package java8.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperators {
    public static Comparator<Integer> comparator = Integer::compareTo;

    public static UnaryOperator<Integer> unaryOperator = (a) ->  a + 2;

    public static BinaryOperator<Integer> binaryOperator = Integer::sum;

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply(2));
        System.out.println(binaryOperator.apply(2,3));

        System.out.println(BinaryOperator.maxBy(comparator).apply(4,5));

        System.out.println(BinaryOperator.minBy(comparator).apply(4,5));
    }
}
