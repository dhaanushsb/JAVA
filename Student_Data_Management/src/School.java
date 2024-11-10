import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class School {
    private static Map<Integer, Grade> studentGrades = new HashMap<>();
    private static QuestionBank questionBank = new QuestionBank();

    public static void main(String[] args) {
        System.out.println("Welcome to CSC Academy");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Join New Course");
            System.out.println("2. Student Details");
            System.out.println("3. Report Card");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice: ");
            int opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
                case 1:
                    joinNewCourse(scanner);
                    break;
                case 2:
                    studentDetails(scanner);
                    break;
                case 3:
                    reportCard(scanner);
                    break;
                case 4:
                    System.out.println("Thanks for coming to our Academy!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void joinNewCourse(Scanner scanner) {
        System.out.print("How many students do you want to add? ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            Student.registerNewStudent(scanner);
        }

        List<Course.CollegeCourse> courses = new ArrayList<>();
        courses.add(new Course.CollegeCourse("C1", "1", "Front End Development", "Learn the basics of front-end development including HTML, CSS, and JavaScript.", 3.0, List.of("HTML", "CSS", "JavaScript")));
        courses.add(new Course.CollegeCourse("C2", "2", "UI/UX Design", "Understand the principles of user interface and user experience design.", 4.0, List.of("Design Principles", "User Research", "Prototyping")));
        courses.add(new Course.CollegeCourse("C3", "3", "Java Programming", "An introduction to Java programming language and object-oriented concepts.", 3.5, List.of("Java Basics", "OOP Concepts", "Advanced Java")));
        courses.add(new Course.CollegeCourse("C4", "4", "Web Development", "Comprehensive course covering both front-end and back-end web development.", 3.0, List.of("HTML", "CSS", "JavaScript", "Node.js")));

        Course.displayCourses(courses);

        for (int i = 0; i < numOfStudents; i++) {
            Student student = null;
            while (student == null) {
                System.out.print("Enter Student ID to register a course: ");
                int studentID = scanner.nextInt();
                scanner.nextLine();
                student = Student.getStudentMap().get(studentID);
                if (student == null) {
                    System.out.println("Invalid student ID or Student ID not found. Please try again.");
                }
            }
            Course.CollegeCourse chosenCourse = Course.chooseCourse(courses, scanner);
            if (chosenCourse != null) {
                System.out.println("Course " + chosenCourse.getCourseName() + " added to the student successfully.");
                Grade grade = new Grade(student, chosenCourse, questionBank);
                grade.takeExam(scanner);
                studentGrades.put(student.getStudentID(), grade);
                student.setGrade(grade); // Ensure the student has their grade set
            } else {
                System.out.println("Course registration was not completed.");
            }
        }
    }

    private static void studentDetails(Scanner scanner) {
        System.out.print("Enter Student ID to view details: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();

        Student student = Student.getStudentMap().get(studentID);
        if (student != null) {
            student.displayStudentInfo();
        } else {
            System.out.println("Invalid student ID or Student ID not found. Please try again.");
        }
    }

    private static void reportCard(Scanner scanner) {
        System.out.print("Enter Student ID to view the report: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();

        Grade grade = studentGrades.get(studentID); // Correctly retrieve the grade from the map
        if (grade != null) {
            ReportCard reportCard = new ReportCard(grade);
            reportCard.printReport();
        } else {
            System.out.println("Invalid student ID or Student ID not found. Please try again.");
        }
    }
}
