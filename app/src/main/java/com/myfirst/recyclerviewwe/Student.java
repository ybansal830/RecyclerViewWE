package com.myfirst.recyclerviewwe;
// Modal class
public class Student {
    private String Name;
    private int age;
    private String rollNo;

    public Student(String name, int age, String rollNo) {
        Name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNo() {
        return rollNo;
    }
}
