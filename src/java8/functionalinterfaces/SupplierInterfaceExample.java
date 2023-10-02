package java8.functionalinterfaces;

import java8.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierInterfaceExample {
    public static Supplier<Student> supplier = () -> new Student("Ajay", 13,8,4.1, Arrays.asList("Computer", "Chess"));
    public static void main(String[] args) {

        System.out.println(supplier.get());

    }
}
