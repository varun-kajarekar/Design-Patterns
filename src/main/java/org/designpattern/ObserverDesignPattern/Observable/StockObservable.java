package org.designpattern.ObserverDesignPattern.Observable;

import org.designpattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscriber();

    public void setStock(int stock);

    public int getStock();

}
