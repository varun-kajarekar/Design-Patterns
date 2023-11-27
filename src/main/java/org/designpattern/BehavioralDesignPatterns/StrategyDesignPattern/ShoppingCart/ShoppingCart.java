package org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern.ShoppingCart;

import org.designpattern.BehavioralDesignPatterns.StrategyDesignPattern.PaymentMethod.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> Cart;

    public ShoppingCart() {
        this.Cart = new ArrayList<>();
    }

    public void addItem(Item item){
        this.Cart.add(item);
    }

    public void remove(Item item){
        this.Cart.remove(item);
    }

    public void pay(PaymentMethod paymentMethod){
        int amount = CalculateAmount();
        paymentMethod.pay(amount);
    }

    private int CalculateAmount() {
        int amount = 0;
        for(Item item : this.Cart){
            amount+=item.getPrice();
        }
        return amount;
    }

}
