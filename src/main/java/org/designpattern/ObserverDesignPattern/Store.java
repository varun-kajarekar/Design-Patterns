package org.designpattern.ObserverDesignPattern;

import org.designpattern.ObserverDesignPattern.Observable.PS5StockObservableImpl;
import org.designpattern.ObserverDesignPattern.Observable.StockObservable;
import org.designpattern.ObserverDesignPattern.Observer.EmailNotificationAlert;
import org.designpattern.ObserverDesignPattern.Observer.MobileNotificationAlert;
import org.designpattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {


    public static void main(String[] args) {
        StockObservable PS5 = new PS5StockObservableImpl();

        NotificationAlertObserver user1 = new MobileNotificationAlert();
        NotificationAlertObserver user2 = new EmailNotificationAlert();

        PS5.add(user1);
        PS5.add(user2);

        PS5.setStock(10);
    }
}
