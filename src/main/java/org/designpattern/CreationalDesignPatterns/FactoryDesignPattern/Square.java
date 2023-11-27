package org.designpattern.CreationalDesignPatterns.FactoryDesignPattern;

import org.designpattern.CreationalDesignPatterns.FactoryDesignPattern.Shape;

public class Square implements Shape {

    @Override
    public void Draw() {
        System.out.println("Square");
    }
}
