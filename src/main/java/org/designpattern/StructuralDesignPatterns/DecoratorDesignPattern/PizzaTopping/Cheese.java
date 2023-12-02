package org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.PizzaTopping;

import org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.BasePizza.BasePizza;

public class Cheese extends ToppingDecorator{

    BasePizza basePizza;

    public Cheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+20;
    }

    public void v(){
        System.out.println("Cheese");
    }
}
