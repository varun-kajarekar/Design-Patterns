package org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.PizzaTopping;

import org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.BasePizza.BasePizza;

public class BarbecueChicken extends ToppingDecorator{

    BasePizza basePizza;

    public BarbecueChicken(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+80;
    }
}
