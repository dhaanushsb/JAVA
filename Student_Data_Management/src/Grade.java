import java.util.HashMap;
import java.util.Scanner;

public class Grade {
    private Student student;
    private Course.CollegeCourse course;
    private HashMap<String, Integer> subjectMarks;
    private QuestionBank questionBank;

    public Grade(Student student, Course.CollegeCourse course, QuestionBank questionBank) {
        this.student = student;
        this.course = course;
        this.subjectMarks = new HashMap<>();
        this.questionBank = questionBank;
    }

    public void takeExam(Scanner scanner) {
        for (String subject : course.getSubjects()) {
            System.out.println("Answer the following questions for " + subject + ":");
            Question[] questions = questionBank.getQuestions(subject);
            int marks = 0;

            for (Question question : questions) {
                System.out.println(question.getQuestion());
                String[] options = question.getOptions();
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }

                System.out.print("Your answer: ");
                int userAnswer = scanner.nextInt();
                if (userAnswer == question.getCorrectAnswer()) {
                    marks += 50;
                }
            }
            subjectMarks.put(subject, marks);
        }
    }

    public int getTotalMarks() {
        return subjectMarks.values().stream().mapToInt(Integer::intValue).sum();
    }

    public char calculateGrade() {
        int totalMarks = getTotalMarks();
        if (totalMarks >= 270) {
            return 'A';
        } else if (totalMarks >= 240) {
            return 'B';
        } else if (totalMarks >= 210) {
            return 'C';
        } else if (totalMarks >= 180) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public double calculateGPA() {
        double totalPoints = 0.0;
        int totalSubjects = subjectMarks.size();
        for (int marks : subjectMarks.values()) {
            if (marks >= 90) {
                totalPoints += 4.0;
            } else if (marks >= 80) {
                totalPoints += 3.0;
            } else if (marks >= 70) {
                totalPoints += 2.0;
            } else if (marks >= 60) {
                totalPoints += 1.0;
            } else {
                totalPoints += 0.0;
            }
        }
        return totalPoints / totalSubjects;
    }

    public Student getStudent() {
        return student;
    }

    public Course.CollegeCourse getCourse() {
        return course;
    }

    public HashMap<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }
}
