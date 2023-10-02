package java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateInterface {
    public static Predicate<Integer> p1 = (i) -> i%2 == 0;
    public static Predicate<Integer> p2 = (i) -> i%5==0;

    public static void printResult() {
        System.out.println(p1.test(2));
    }

    public static void predicateAnd(){
        System.out.println(p1.and(p2).test(5));
    }

    public static void predicateOR() {
        System.out.println(p1.or(p2).test(5));
    }

    public static void predicateNegate() {
        System.out.println(p1.negate().test(5));
    }

    public static void main(String[] args) {
        printResult();
        predicateAnd();
        predicateOR();
        predicateNegate();
    }
}
