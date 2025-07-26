//package org.example.BehaviouralPattern.ObserverPattern;
//
//public class BadNewsPublisher {
//
//    public void publish(String news){
//
//        // Directly calling subscribers — tightly coupled
//        EmailService emailService = new EmailService();
//        emailService.sendEmail(news);
//
//        SMS sms = new SMS();
//        sms.sendSMS(news);
//    }
//
//    public static void main(String[] args) {
//        BadNewsPublisher badNewsPublisher = new BadNewsPublisher();
//        badNewsPublisher.publish("Breaking News!");
//    }
//
//}
//
//class EmailService {
//    public void sendEmail(String news){
//        System.out.println("Sending email to: "+news);
//    }
//}
//
//class SMS{
//    public void sendSMS(String news){
//        System.out.println("Sending SMS to: "+news);
//    }
//}
