package Lesson4.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalPaymentCompatibleCreditCard card : cards){
                card.makeInternationalPayment();
        }
    }
}

/*
Liskovs substitution principle
This one has lesser coupling - Everytime we have a new behavior we have to change the class this is wrong we should try as much as possible reduce the coupling
 */
