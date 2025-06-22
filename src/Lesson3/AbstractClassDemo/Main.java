package Lesson3.AbstractClassDemo;

public class Main {
    public static void main(String[] args) {
        Product p = new Macbook();
        p.termsAndConditions();

        Product p2 = new LenovoLaptop();
        p2.termsAndConditions();

        System.out.println("Macbook discount: " + p.calculateDiscount());

    }
}

/*
In java multiple inheritance is not allowed due to the diamond problem -> At runtime which method should be call in not clear





Product class is abstract so we cant instantiate a object from it In the Parent Class reference we can allocate a child class object.

Interfaces are simple contracts
They doesnot have any kind of implementations
They donot have any constrcutors we can instantiate them

The only responsility of the repository layer is to fetch and update the data

Due to reasons there are also migrations of the databases [MongoQueries , MySQLQueries, OracleQueries] - We should not depend on the concrete classes instead we should just depend on the interfaces We donot want any common behavior but all we want is a strict contract Which interface comes to use on the run time we dont care about that we just know that we are using the interface which is the template [Drive-through store]


 */
