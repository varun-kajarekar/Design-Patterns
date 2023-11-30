package org.designpattern.CreationalDesignPatterns.BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    int roll_no;
    String first_name;
    String last_name;
    String address;
    List<String> subject;

    public StudentBuilder setRoll_no(int roll_no) {
        this.roll_no = roll_no;
        return this;
    }

    public StudentBuilder setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public StudentBuilder setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    abstract public StudentBuilder setSubject();

    public Student Build(){
        return new Student(this);
    }
}
