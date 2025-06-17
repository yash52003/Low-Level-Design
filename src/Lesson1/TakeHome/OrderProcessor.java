package Lesson1_SingleResponsibilityPrinciple.TakeHomeTask;

// Read the code and try to figure out whether it complies to SRP or not ? And If not then how can we refactor ?
class Order{
    // .. some properties
}

class User {
    // .. some properties
}

public class OrderProcessor {
    public void processOrder(Order order) {
        // Code to process the order
    }

    public void calculateTotalSum(Order order) {
        // Code to calculate total sum
    }

    public void sendEmailNotification(User user) {
        // Code to send email notifications
    }
}

/*
Doesnot follows SRP distribute it USER and Order seperate classes
Order Process there are three different functions but all three has to be done in in an order Fourfunctions
 */