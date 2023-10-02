package java8.labdas;

import java.util.Comparator;

public class ComparatorLambdaExpression <T>{
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1==o2
                                         // 1 -> o1 > o2
                                         // -1 o1 < o2
            }
        };

        System.out.println("Comparator result is " + comparator.compare(3,2));

        Comparator<Integer> lambdaComparator = Integer::compareTo;

        System.out.println("Result of LambdaComparator is: "+ lambdaComparator.compare(3,2));
    }
}
