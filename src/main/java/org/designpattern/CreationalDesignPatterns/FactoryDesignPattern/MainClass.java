package org.designpattern.CreationalDesignPatterns.FactoryDesignPattern;

public class MainClass {


    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj =  shapeFactoryObj.getShape("RECTANGLE");
        shapeObj.Draw();
    }
}
