package org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.PizzaTopping;

import org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.BasePizza.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
