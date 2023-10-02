package java8.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    public static List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Rohit", 13, 8, 3.3, Arrays.asList("coding", "gym"));

        Student student2 = new Student("Rahul", 13, 8, 3.9, Arrays.asList("reading", "bike riding"));

        Student student3 = new Student("Vijay", 13, 8, 4, Arrays.asList("coding", "running"));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        return studentList;
    }
}
