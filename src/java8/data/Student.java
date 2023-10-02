package java8.data;

import java.util.List;

public class Student {

    private String name;

    private int age;

    private  double grade;

    private double gpa;

    private List<String> activities;

    public  Student(String name, int age, double grade, double gpa, List<String> activities) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gpa = gpa;
        this.activities = activities;
    }

    public String getName() {
        return  this.name;
    }

    public int  getAge() {
        return this.age;
    }

    public Integer getGrade(){
        return (int)this.grade;
    }

    public double getGpa(){
        return this.gpa;
    }

    public List<String> getActivities() {return this.activities;}

    @Override
    public String toString() {
        return "Name is " + this.getName() + "Age is " + this.getAge() + "GPA is " + this.getGpa() + "Grade is " + this.getGrade();
    }
}
