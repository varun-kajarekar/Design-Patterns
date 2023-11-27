package org.designpattern.BehavioralDesignPatterns.ObserverDesignPattern.Observer;

public class EmailNotificationAlert implements NotificationAlertObserver{
    @Override
    public void update() {


        System.out.println("sent notification on the Email");
    }
}
