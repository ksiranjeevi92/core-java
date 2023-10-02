package java8.consumerinterface;

import java8.data.Student;
import java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    List<Student> studentList = StudentDatabase.getAllStudent();

    Consumer<Student> c1 = (student) -> System.out.println("Student" + student);
    Consumer<Student> c2 =  (student) -> System.out.print(student.getName());

    Consumer<Student> c3 = (student) -> System.out.print(student.getActivities());

    public  void printStudent() {
        studentList.forEach(c1);
    }

    public static void main(String[] args) {
        ConsumerInterface consumerInterface = new ConsumerInterface();

       // consumerInterface.printStudent();

        consumerInterface.studentList.forEach(student -> {
            if(student.getGpa() >= 3.5) {
                consumerInterface.c2.andThen(consumerInterface.c3).accept(student);
            }
        });
    }
}
