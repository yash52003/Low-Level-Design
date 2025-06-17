package Lesson1_SingleResponsibilityPrinciple.TakeHomeTask;
// Read the code and try to figure out whether it complies to SRP or not ? And If not then how can we refactor ?
class Student {
    // .. some properties
}
public class SchoolManager {
    public void enrollStudent(Student student) {
        // Code for student enrollment
    }

    public void scheduleClasses() {
        // Code to schedule classes
    }

    public void manageTeacherSalaries() {
        // Code for managing teacher salaries
    }

    public void maintainSchoolInfrastructure() {
        // Code for maintaining infrastructure
    }
}

/*
Does not follows SRP
Choice of the User - What Kind of Notification does he want

We want a maintainable extensible code
 */