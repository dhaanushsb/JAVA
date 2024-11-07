import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Report Management System");
        Scanner scanner = new Scanner(System.in);

        // Register new student
        Student.registerNewStudent(scanner);

        // Display available courses
        List<Course.CollegeCourse> courses = new ArrayList<>();
        courses.add(new Course.CollegeCourse("C1", "1", "Front End Development", "Learn the basics of front-end development including HTML, CSS, and JavaScript.", 3.0, List.of("HTML", "CSS", "JavaScript")));
        courses.add(new Course.CollegeCourse("C2", "2", "UI/UX Design", "Understand the principles of user interface and user experience design.", 4.0, List.of("Design Principles", "User Research", "Prototyping")));
        courses.add(new Course.CollegeCourse("C3", "3", "Java Programming", "An introduction to Java programming language and object-oriented concepts.", 3.5, List.of("Java Basics", "OOP Concepts", "Advanced Java")));
        courses.add(new Course.CollegeCourse("C4", "4", "Web Development", "Comprehensive course covering both front-end and back-end web development.", 3.0, List.of("HTML", "CSS", "JavaScript", "Node.js")));

        Course.displayCourses(courses);

        // Loop to keep asking for a valid student ID
        Student student = null;
        while (student == null) {
            System.out.print("Enter Student ID to register a course: ");
            int studentID = scanner.nextInt();
            scanner.nextLine(); // consume newline

            student = Student.getStudentMap().get(studentID);
            if (student == null) {
                System.out.println("Invalid student ID or Student ID not found. Please try again.");
            }
        }

        Course.CollegeCourse chosenCourse = Course.chooseCourse(courses, scanner);
        if (chosenCourse != null) {
            System.out.println("Course " + chosenCourse.getCourseName() + " added to the student successfully.");

            // Assign grades for the course
            Grade grade = new Grade(student, chosenCourse);
            grade.assignGrades(scanner);

            // Generate report card
            ReportCard reportCard = new ReportCard(grade);
            reportCard.printReport();
        } else {
            System.out.println("Course registration was not completed.");
        }

        scanner.close();
    }
}
