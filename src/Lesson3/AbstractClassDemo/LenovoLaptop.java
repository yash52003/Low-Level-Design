package Lesson3.AbstractClassDemo;

public class LenovoLaptop extends Product {

    @Override
    public double calculateDiscount() {
        return 0; // 15% discount for Lenovo Laptop
    }

    @Override
    public void termsAndConditions() {
        System.out.println("Lenovo Laptop terms and conditions apply.");
    }
}
