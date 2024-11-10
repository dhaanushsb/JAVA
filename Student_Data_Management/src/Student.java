import java.util.HashMap;
import java.util.Scanner;

public class Student {
    private int studentID;
    private String studentName;
    private int age;
    private String phoneNo;
    private Grade grade;
    private static HashMap<Integer, Student> studentMap = new HashMap<>();

    public Student(int studentID, String studentName, int age, String phoneNo) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Phone No: " + phoneNo);
    }

    public static HashMap<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public static void registerNewStudent(Scanner scanner) {
        int studentID;
        while (true) {
            System.out.print("Enter Student ID: ");
            studentID = scanner.nextInt();
            scanner.nextLine();
            if (studentMap.containsKey(studentID)) {
                System.out.println("This Student ID is already taken. Please enter a unique Student ID.");
            } else {
                break;
            }
        }
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Phone No: ");
        String phoneNo = scanner.nextLine();

        Student student = new Student(studentID, studentName, age, phoneNo);
        studentMap.put(studentID, student);
        System.out.println("Student registered successfully.");
    }
}
