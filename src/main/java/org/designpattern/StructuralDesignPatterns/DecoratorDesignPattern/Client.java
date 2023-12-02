package org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern;

import org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.BasePizza.BasePizza;
import org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.BasePizza.FarmhousePizza;
import org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.PizzaTopping.BarbecueChicken;
import org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.PizzaTopping.Cheese;

public class Client {

    public static void main(String[] args) {

        BasePizza CheeseBarbecueChickenPizza = new Cheese(new BarbecueChicken(new FarmhousePizza()));

        int cost = CheeseBarbecueChickenPizza.cost();

        System.out.println(cost);


    }
}
