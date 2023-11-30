package org.designpattern.CreationalDesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        List<String> subject = new ArrayList<>();
        subject.add("EngineeringSUBJECT1");
        subject.add("EngineeringSUBJECT2");
        subject.add("EngineeringSUBJECT3");
        this.subject=subject;
        return this;
    }
}
