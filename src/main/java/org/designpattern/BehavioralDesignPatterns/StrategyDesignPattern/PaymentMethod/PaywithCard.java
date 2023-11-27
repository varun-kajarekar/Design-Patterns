package org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern.PaymentMethod;

public class PaywithCard implements PaymentMethod {


    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with Card");
    }
}
