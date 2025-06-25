package Lesson4.BetterCode;

public class MasterCard extends CreditCard implements InternationalPaymentCompatibleCreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay implementation of MasterCard");
    };

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer Implementation of MasterCard");
    };

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay implementation of MasterCard");
    };

    @Override
    public void mandatePayments() {
        System.out.println("MandatePayments Implementations of MasterCard");
    };

    @Override
    public void makeInternationalPayment(){
        System.out.println("International Payment implementation of MasterCard");
    }
}


/*
Whenever we are having a is a relationship means we are having subclasses so we should never have a specific type of handlind for any of the subclasses all the subclasses must be substitutable at any point of time in the program

Employee (Super Class) --> Abstract Class
calculate salary method --> we should make this methods as abstract
Types of Empoloyees [FullTimeEmployees , Interns , Vendors]
 */
