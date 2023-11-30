package org.designpattern.CreationalDesignPatterns.BuilderDesignPattern;

import java.util.List;

public class Student {

    int roll_no;
    String first_name;
    String last_name;
    String address;
    List<String> subject;

    public Student(StudentBuilder studentBuilder) {
        this.roll_no = studentBuilder.roll_no;
        this.first_name = studentBuilder.first_name;
        this.last_name = studentBuilder.last_name;
        this.address = studentBuilder.address;
        this.subject = studentBuilder.subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", subject=" + subject +
                '}';
    }
}
