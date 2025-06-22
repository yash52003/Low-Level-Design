package Lesson3.AbstractClassDemo;

public class Macbook extends Product{
   @Override
    public double calculateDiscount() {
        return 0; // 10% discount for Macbook
    }

    @Override
    public void termsAndConditions() {
        System.out.println("Macbook terms and conditions apply.");
    }
}
