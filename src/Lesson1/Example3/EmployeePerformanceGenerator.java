package Lesson1.Example3;
import Lesson1.Example2.BetterCode.Employee;

public class EmployeePerformanceGenerator {
    public String generateReport(String reportType, Employee employee) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}

/*
This class follows the single responsibilty principle because this class has only one responsibility of generating the performance report of the employee

multiple if else is a very bad code - we need a extensible code (Smelling the bad code)

Rule 1 - Donot be Rigid
Rule 2 - Donot OverEngineer
 */
