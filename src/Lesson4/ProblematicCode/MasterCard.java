package Lesson4.ProblematicCode;

public class MasterCard extends CreditCard{
    @Override
    public  void tapAndPay(){
        System.out.println("Tap and pay implementation of MasterCard");
    };

    @Override
    public  void onlineTransfer(){
        System.out.println("Online Transfer Implementation of MasterCard");
    };

    @Override
    public void swipeAndPay(){
        System.out.println("Swipe and Pay implementation of MasterCard");
    };

    @Override
    public void mandatePayments(){
        System.out.println("MandatePayments Implementations of MasterCard");
    };
}
