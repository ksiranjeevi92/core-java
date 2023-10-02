package java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionInterfaceExample {
    public static Function<String, String> function  = String::toUpperCase;

    public static Function<String, String> addSomething = (name) -> name.concat("default");

    public static void main(String[] args) {
        String result = FunctionInterfaceExample.function.andThen(addSomething).apply("java8");

        System.out.println(FunctionInterfaceExample.function.compose(addSomething).apply(result));

        System.out.println(result);
    }
}
