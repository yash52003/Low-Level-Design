package Lesson1;

/*
Simple Dummy Class
 */

public class Employee{
    private int id;
    public int getId(){
        return this.id;
    }

    public String fetchBioData() {
        return "Bio Data of Employee with ID: " + id;
    }

    public double calculateSalary() {
        //frequent change possible accoring to tax regime
        return 50000.0; // Example fixed salary
    }

    public void printPerformanceData() {
        System.out.println("Performance data for Employee with ID: " + id);
    }

}

/*
If we have multiple reasons to change the function then we are violating the single responsibility principle

Violates the single responsibility principle because it has multiple responsibilites
- fetching bio data, calculating salary, and printing performance data. if we donot follow the single responsibility principle then the maintennece of the functions would be very difficult a lot of if else will come up testing becomes hard so proportionally the maintennece also becomes hard
 */
