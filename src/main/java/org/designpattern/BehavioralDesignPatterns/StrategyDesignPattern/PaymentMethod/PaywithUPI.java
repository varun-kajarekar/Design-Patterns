package org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern.PaymentMethod;

public class PaywithUPI implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid with UPI");
    }
}
