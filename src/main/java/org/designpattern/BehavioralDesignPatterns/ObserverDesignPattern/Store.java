package org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern;

import org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observable.PS5StockObservableImpl;
import org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observable.StockObservable;
import org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observer.MobileNotificationAlert;
import org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;
import org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observer.EmailNotificationAlert;

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
