package org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern;

import org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern.ShoppingCart.Item;
import org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern.PaymentMethod.PaywithCard;
import org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern.PaymentMethod.PaywithUPI;
import org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern.ShoppingCart.ShoppingCart;

public class Store {



    /*
    https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial

    Strategy design pattern is one of the behavioral design pattern.
    Strategy pattern is used when we have multiple algorithm for a specific task
    and client decides the actual implementation to be used at runtime. */

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item mobile = new Item(10000,"Samsung");
        Item laptop = new Item(100000,"Asus");

        shoppingCart.addItem(mobile);
        shoppingCart.addItem(laptop);


        shoppingCart.pay(new PaywithUPI());
        shoppingCart.pay(new PaywithCard());
    }
}
