import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Grade {
    private Student student;
    private Course.CollegeCourse course;
    private HashMap<String, Integer> subjectMarks;
    private HashMap<String, Character> subjectGrades;

    public Grade(Student student, Course.CollegeCourse course) {
        this.student = student;
        this.course = course;
        this.subjectMarks = new HashMap<>();
        this.subjectGrades = new HashMap<>();
    }

    public void assignGrades(Scanner scanner) {
        for (String subject : course.getSubjects()) {
            System.out.print("Enter marks for " + subject + ": ");
            int marks = scanner.nextInt();
            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            subjectMarks.put(subject, marks);
            subjectGrades.put(subject, grade);
        }
    }

    public void displayGrades() {
        System.out.println("Grades for " + student.getStudentName() + " in " + course.getCourseName() + ":");
        for (String subject : course.getSubjects()) {
            System.out.println(subject + ": Marks - " + subjectMarks.get(subject) + ", Grade - " + subjectGrades.get(subject));
        }
    }

    public double calculateGPA() {
        double totalPoints = 0;
        int totalSubjects = subjectGrades.size();
        for (char grade : subjectGrades.values()) {
            switch (grade) {
                case 'A':
                    totalPoints += 4.0;
                    break;
                case 'B':
                    totalPoints += 3.0;
                    break;
                case 'C':
                    totalPoints += 2.0;
                    break;
                case 'D':
                    totalPoints += 1.0;
                    break;
                default:
                    totalPoints += 0;
                    break;
            }
        }
        return totalPoints / totalSubjects;
    }

    public HashMap<String, Character> getSubjectGrades() {
        return subjectGrades;
    }
}
