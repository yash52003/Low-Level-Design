package Lesson4.ProblematicCode;

public class VisaCard extends CreditCard{
    @Override
    public  void tapAndPay(){
        System.out.println("Tap and pay implementation of VISA");
    };

    @Override
    public  void onlineTransfer(){
        System.out.println("Online Transfer Implementation of VISA");
    };

    @Override
    public void swipeAndPay(){
        System.out.println("Swipe and Pay implementation of VISA");
    };

    @Override
    public void mandatePayments(){
        System.out.println("MandatePayments Implementations");
    };

    @Override
    public void upiPayment() {
        throw new NoSuchMethodException();
    }


    @public void intlPayment() {
        System.out.println("International Payment implementation of VISA");
    }
}

/*
This is wrong there is a forceful exception throw which is happening here
 */

