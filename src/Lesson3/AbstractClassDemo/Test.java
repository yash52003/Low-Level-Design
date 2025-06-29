package Lesson3.AbstractClassDemo;

class A{

}

class B{

}

interface a{
    default void doSome(){
        System.out.println("Doing some work in interface a");
    };
}

interface b{
    default void doSome(){
        System.out.println("Doing some work in interface b");
    };
}

class c implements a,b{
    @Override
    public void doSome(){
        b.super.doSome();
    }
}


public class Test {

}

/*
A class cannot extend more than one classes

The interfaces can also have methods using the default keyword

Single method implementation is called functional interface - Lamda expression - Even in interface we can have the implementation of some of the methods

We just wants strict contracts instead we just want the template - Interface (Interface is the best way to acheive abstraction - runtime polymorphism)

IRepository = new MySQL Repository();
During the rumtime the object which is initiated will be deciding which implementation should be followed

Concreate Classes is a very bad approach to move forward

3 things
- I have no implemetation
- I don't know how it's implemented
- In abstraction i dont care how the things are internally implemented (Internal details are hidden [It means we don't care about it])

If we go via the multiple inheritance scenario then the we need to update the service class again -
Violates the single responsibility principle

Then in java what to do
keep the instances of the other class in the service class
but in this case also is the new repository comes then we need to again modify the service class at the moment if we wanted to use only one repsoitory the other repository instances are wasted

what all languages donot support multiple inheritance
Java , Python, C#, C++, Ruby, Go, Swift, Kotlin, Rust, Dart, PHP, JavaScript

If we use the multiple inheritance in the classes instead of abstraction or interfaces then we need to update the service class again and again and we are not acheiving the abstraction
 */
