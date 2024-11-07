import java.util.HashMap;

public class ReportCard {
    private Grade grade;

    public ReportCard(Grade grade) {
        this.grade = grade;
    }

    public void printReport() {
        grade.displayGrades();
        double gpa = grade.calculateGPA();
        System.out.println("Overall GPA: " + gpa);
        System.out.println("Performance: " + getPerformance(gpa));
    }

    private String getPerformance(double gpa) {
        if (gpa >= 3.5) {
            return "Excellent";
        } else if (gpa >= 3.0) {
            return "Good";
        } else if (gpa >= 2.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}
