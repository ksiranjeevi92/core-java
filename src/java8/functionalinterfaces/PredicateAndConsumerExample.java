package java8.functionalinterfaces;

import java8.data.Student;
import java8.data.StudentDatabase;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;

public class PredicateAndConsumerExample {

    public static Predicate<Student> p1 = (s) -> s.getGrade() > 3;

    public static Predicate<Student> p2 = (s) -> s.getGpa()  > 3.9;

    public static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    public static BiPredicate<Integer, Double> biPredicate = (gradeLevel,Gpa) -> gradeLevel > 3 && Gpa >3.9;

    public static Consumer<Student> studentConsumer = (student) -> {
//        if(p1.and(p2).test(student)){
//            biConsumer.accept(student.getName(), student.getActivities());
//        }

        if(biPredicate.test(student.getGrade(),student.getGpa())){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudent();

        studentList.forEach(PredicateAndConsumerExample.studentConsumer);
    }
}
