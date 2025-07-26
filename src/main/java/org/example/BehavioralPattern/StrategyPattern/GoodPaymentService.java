//package org.example.BehavioralPattern.StrategyPattern;
//
//// Step 1: Strategy Interface
//interface paymentStrategy {
//    void pay();
//}
//
//// Step 3: Context class
//public class GoodPaymentService {
//
//    private paymentStrategy paymentStrategy;
//
//    public void setPaymentStrategy(paymentStrategy paymentStrategy) {
//
//        // Set strategy dynamically
//        this.paymentStrategy = paymentStrategy;
//    }
//
//    public void makePayment(){
//        if(paymentStrategy==null){
//            throw new IllegalStateException("Payment strategy not set");
//        }
//        paymentStrategy.pay();
//    }
//
//    public static void main(String[] args) {
//        GoodPaymentService goodPaymentService = new GoodPaymentService();
//
//        UPIPayment upiPayment = new UPIPayment();
//        goodPaymentService.setPaymentStrategy(upiPayment);
//        goodPaymentService.makePayment();
//
//        NetBankingPayment netBankingPayment = new NetBankingPayment();
//        goodPaymentService.setPaymentStrategy(netBankingPayment);
//        goodPaymentService.makePayment();
//
//        CardPayment cardPayment = new CardPayment();
//        goodPaymentService.setPaymentStrategy(cardPayment);
//        goodPaymentService.makePayment();
//    }
//}
//
//// Step 2: Concrete Strategies
//class UPIPayment implements paymentStrategy{
//    @Override
//    public void pay() {
//        System.out.println("Paying through UPI");
//    }
//}
//
//class CardPayment implements paymentStrategy{
//    @Override
//    public void pay() {
//        System.out.println("Paying through CardPayment");
//    }
//}
//
//class NetBankingPayment implements paymentStrategy{
//    @Override
//    public void pay() {
//        System.out.println("Paying through NetBankingPayment");
//    }
//}
