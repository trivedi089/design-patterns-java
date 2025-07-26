//package org.example.BehaviouralPattern.ObserverPattern;
//
//import java.util.ArrayList;
//import java.util.List;
//
//// Step 1: Observer Interface
//interface Observer{
//    void update(String news);
//}
//
//// Step 2: Subject (Publisher)
//public class GoodNewsPublisher {
//
//    private List<Observer> observers = new ArrayList<>();
//
//    public void addSubscriber(Observer observer) {
//        observers.add(observer);
//    }
//    public void removeSubscriber(Observer observer){
//        observers.remove(observer);
//    }
//    public void publish(String news){
//        for(Observer ob : observers){
//            ob.update(news);
//        }
//    }
//
//    public static void main(String[] args) {
//        GoodNewsPublisher goodNewsPublisher = new GoodNewsPublisher();
//
//        Observer emailService = new EmailService();
//        goodNewsPublisher.addSubscriber(emailService);
//
//        Observer SMSService = new SMSService();
//        goodNewsPublisher.addSubscriber(SMSService);
//
//        goodNewsPublisher.publish("Observer pattern developed successfully");
//    }
//}
//
//// Step 3: Concrete Observers
//class EmailService implements Observer{
//    @Override
//    public void update(String news){
//        System.out.println("Email Subscriber received : "+news);
//    }
//}
//
//class SMSService implements Observer{
//    @Override
//    public void update(String news){
//        System.out.println("SMS Subscriber received : "+news);
//    }
//}
//
