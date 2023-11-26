package org.designpattern.StrategyDesignPattern.PaymentMethod;

import org.designpattern.StrategyDesignPattern.PaymentMethod.PaymentMethod;

public class PaywithUPI implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid with UPI");
    }
}
