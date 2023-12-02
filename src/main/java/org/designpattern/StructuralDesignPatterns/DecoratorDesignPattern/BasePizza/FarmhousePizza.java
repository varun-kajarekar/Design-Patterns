package org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.BasePizza;

import org.designpattern.StructuralDesignPatterns.DecoratorDesignPattern.BasePizza.BasePizza;

public class FarmhousePizza extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
