package org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observer;

public class MobileNotificationAlert implements NotificationAlertObserver{
    @Override
    public void update() {


        System.out.println("sent notification on the mobile");
    }
}
