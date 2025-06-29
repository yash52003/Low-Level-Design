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

    @Override
    public void upiPayment() {
        System.out.println("UPI Payment implementation of RupayCard");
    }

    @Override
    public void intlPayment() {
        throw new NoSuchMethodException();
    }
}

/*
cronjaw which we have setup - it gets the calculate salary method from the Employee class and it will call the make payment method of the Employee class

Liskov's Substition Principle - Inheritance might not be the best way always for reusability [Do inheritance is there is only a strict is a relationship]

LSP - Subtypes must be substitutable for their base types.

-Objects of the child class must be as it is substitutable for the objects of the parent class.
- No change should be required in the codebase to accomodate a specific child class. Child class should not need any special treatment.
- Child class should do exactly what the parent class expects


 */