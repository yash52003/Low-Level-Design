package Lesson1.Example2.BetterCode;

public class FetchEmployeeBioData {

    public String fetchBioData(Employee employee) {
        // Assuming the bio data is fetched from a database or an external service
        return "Bio data for employee with ID: " + employee.getEmployeeId();
    }
}
