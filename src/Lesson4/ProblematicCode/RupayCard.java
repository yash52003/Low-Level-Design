package Lesson4.ProblematicCode;

public class RupayCard extends CreditCard{
    @Override
    public  void tapAndPay(){
        System.out.println("Tap and pay implementation of RupayCard");
    };

    @Override
    public  void onlineTransfer(){
        System.out.println("Online Transfer Implementation of RupayCard");
    };

    @Override
    public void swipeAndPay(){
        System.out.println("Swipe and Pay implementation of RupayCard");
    };

    @Override
    public void mandatePayments(){
        System.out.println("MandatePayments Implementations of RupayCard");
    };

}
