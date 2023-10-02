package java8.functionalinterfaces;

import java8.data.Student;
import java8.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiFunctionPredicate {
    public static BiFunction<List<Student>, Predicate<Student>,Map<String,Double>> biFunction = (studentList, studentPredicate) -> {
        Map<String, Double> studentMap = new HashMap<>();
        studentList.forEach(student -> {
            if(studentPredicate.test(student)){
                studentMap.put(student.getName(),student.getGpa());
            }
        });

        return studentMap;
    };
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDatabase.getAllStudent(),PredicateAndConsumerExample.p1));
    }
}
