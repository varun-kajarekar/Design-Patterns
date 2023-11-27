package org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observable;

import org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscriber();

    public void setStock(int stock);

    public int getStock();

}
