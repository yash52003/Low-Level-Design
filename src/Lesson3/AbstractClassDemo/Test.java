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
 */
