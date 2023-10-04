package java8.streams;

import java8.data.Student;
import java8.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsExample {
    public static void main(String[] args) {
        List<String> listActivities =  StudentDatabase.getAllStudent().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listActivities);
    }
}
