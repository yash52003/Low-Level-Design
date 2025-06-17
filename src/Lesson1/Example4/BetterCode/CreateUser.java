package Lesson1.Example4.BetterCode;

public class CreateUser {
    public void createUser(User user){
        System.out.println("Creating user: " + user.userName + " with ID: " + user.userId);
    }
}

/*
Creating and Deleting the User both have to interact with the database and are a part of the userlife cycle then what can be a fair solution to it.

 we want a thin line that when have we overengineered and when have we just simply solved the problem

 How to detect if srp is not fulfilled
 1. Monster Functions - Very large function that do a lot of things - Every thing in the controlled
 */
