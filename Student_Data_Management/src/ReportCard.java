public class ReportCard {
    private Grade grade;

    public ReportCard(Grade grade) {
        this.grade = grade;
    }

    public void printReport() {
        System.out.println("Report for " + grade.getStudent().getStudentName() + " in " + grade.getCourse().getCourseName() + ":");
        grade.getSubjectMarks().forEach((subject, marks) -> System.out.println(subject + ": Marks - " + marks));

        int totalMarks = grade.getSubjectMarks().values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total Marks: " + totalMarks);

        char overallGrade = grade.calculateGrade();
        System.out.println("Overall Grade: " + overallGrade);

        double gpa = grade.calculateGPA();
        System.out.println("GPA: " + gpa);

        System.out.println("Performance: " + getPerformance(overallGrade));
    }

    private String getPerformance(char grade) {
        switch (grade) {
            case 'A':
                return "Excellent";
            case 'B':
                return "Good";
            case 'C':
                return "Average";
            case 'D':
                return "Poor";
            default:
                return "Fail";
        }
    }
}
