package org.designpattern.CreationalDesignPatterns.BuilderDesignPattern;

public class Client {

    public static void main(String[] args) {


        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student EngineeringStudent  = director1.createStudent();
        Student MBAStudent = director2.createStudent();

        System.out.println(EngineeringStudent.toString());
        System.out.println(MBAStudent.toString());


    }
}
