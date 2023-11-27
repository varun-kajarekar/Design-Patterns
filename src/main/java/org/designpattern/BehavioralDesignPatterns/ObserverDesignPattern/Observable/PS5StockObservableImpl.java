package org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observable;

import org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class PS5StockObservableImpl implements StockObservable{
    private List<NotificationAlertObserver> PS5Observer;
    private int stock = 0;

    public PS5StockObservableImpl() {
        this.PS5Observer = new ArrayList<>();
    }

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        PS5Observer.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        PS5Observer.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : PS5Observer){
            observer.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if(this.stock == 0){
            notifySubscriber();
        }
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}
