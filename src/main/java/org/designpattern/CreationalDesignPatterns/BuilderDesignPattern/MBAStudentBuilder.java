package org.designpattern.CreationalDesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubject() {
        List<String> subject = new ArrayList<>();
        subject.add("MBASUBJECT1");
        subject.add("MBASUBJECT2");
        subject.add("MBASUBJECT3");
        this.subject=subject;
        return this;
    }
}
