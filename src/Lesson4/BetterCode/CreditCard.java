package Lesson4.BetterCode;

public abstract class CreditCard {
    private String ccNumber;
    private String ownerName;
    private int cvv;

    public void setccNumber(String ccNumber){
        this.ccNumber = ccNumber;
    }

    public void setownerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void setCvv(int cvv){
        this.cvv = cvv;
    }

    public abstract void tapAndPay();
    public abstract void onlineTransfer();

    public abstract void swipeAndPay();

    public abstract void mandatePayments();

    public void displayCreditCardDetails(){
        System.out.println("CC Number: " + this.ccNumber + ", with Owner Name: " + this.ownerName);
    }

}

/*
Benefits of an abstract class over an interface we can have the common class properties as well

Visacard , Mastercard and these card have a is a relationship with the credit card therefore we will just extend

// For
 */
