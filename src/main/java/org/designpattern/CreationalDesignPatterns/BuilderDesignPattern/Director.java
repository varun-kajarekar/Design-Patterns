package org.designpattern.CreationalDesignPatterns.BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }


    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setFirst_name("karan").setLast_name("kajarekar").setRoll_no(1).setSubject().Build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setFirst_name("varun").setLast_name("kajarekar").setSubject().Build();
    }
}
