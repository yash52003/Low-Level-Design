package Lesson3.AbstractClassDemo;

public abstract class Product {
    public abstract double calculateDiscount();

    public void termsAndConditions() {
        System.out.println("Terms and conditions apply.");
    }
}
