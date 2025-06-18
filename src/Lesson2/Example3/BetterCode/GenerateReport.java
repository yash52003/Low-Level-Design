package Lesson2.Example3.BetterCode;

public class GenerateReport {
    public void generateReport(ReportGenerator reportGenerator) {
        String report = reportGenerator.generate();
        System.out.println(report);
    }
}

//We will finally call this GenerateReport Class
