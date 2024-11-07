import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
    static class CollegeCourse {
        private String courseId;
        private String courseNumber;
        private String courseName;
        private String description;
        private double credits;
        private List<String> subjects;

        public CollegeCourse(String courseId, String courseNumber, String courseName, String description, double credits, List<String> subjects) {
            this.courseId = courseId;
            this.courseNumber = courseNumber;
            this.courseName = courseName;
            this.description = description;
            this.credits = credits;
            this.subjects = subjects;
        }

        public String getCourseId() {
            return courseId;
        }

        public String getCourseNumber() {
            return courseNumber;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getDescription() {
            return description;
        }

        public double getCredits() {
            return credits;
        }

        public List<String> getSubjects() {
            return subjects;
        }

        public void displayCourseInfo() {
            System.out.println("Course ID: " + courseId);
            System.out.println("Course Number: " + courseNumber);
            System.out.println("Course Name: " + courseName);
            System.out.println("Description: " + description);
            System.out.println("Credits: " + credits);
            System.out.println("Subjects:");
            for (String subject : subjects) {
                System.out.println("- " + subject);
            }
            System.out.println();
        }
    }

    public static void displayCourses(List<CollegeCourse> courses) {
        System.out.println("Available Courses:");
        for (CollegeCourse course : courses) {
            System.out.println(course.getCourseNumber() + ": " + course.getCourseName() + " (ID: " + course.getCourseId() + ")");
        }
    }

    public static CollegeCourse chooseCourse(List<CollegeCourse> courses, Scanner scanner) {
        System.out.print("Enter the Course Number to view details: ");
        String selectedCourseNumber = scanner.nextLine();

        for (CollegeCourse course : courses) {
            if (course.getCourseNumber().equalsIgnoreCase(selectedCourseNumber)) {
                course.displayCourseInfo();
                System.out.print("Do you want to register for " + course.getCourseName() + "? (y/n): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("y")) {
                    return course;
                }
            }
        }
        return null;
    }
}
