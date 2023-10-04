package java8.streams;

import java8.data.Student;
import java8.data.StudentDatabase;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class StreamsExample {
    static Predicate<Student> studentPredicate = (student) -> student.getGrade() > 3;

    static Predicate<Student> studentGpaPredicate = (student) -> student.getGpa() > 3.9;

    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDatabase.getAllStudent().stream()
                .filter(studentPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);

    }
}
