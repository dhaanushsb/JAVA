import java.util.HashMap;
import java.util.Map;

public class QuestionBank {
    private Map<String, Question[]> questionSet;

    public QuestionBank() {
        questionSet = new HashMap<>();
        initializeQuestions();
    }

    private void initializeQuestions() {
        // Front End Development
        addQuestions("HTML", new Question[]{
            new Question("What does HTML stand for?", new String[]{"Hyper Text Markup Language", "Home Tool Markup Language", "Hyperlinks and Text Markup Language"}, 1),
            new Question("Who is making the Web standards?", new String[]{"Mozilla", "Microsoft", "The World Wide Web Consortium", "Google"}, 3)
        });

        addQuestions("CSS", new Question[]{
            new Question("What does CSS stand for?", new String[]{"Cascading Style Sheets", "Colorful Style Sheets", "Computer Style Sheets"}, 1),
            new Question("Which CSS property is used to change the text color of an element?", new String[]{"color", "text-color", "font-color"}, 1)
        });

        addQuestions("JavaScript", new Question[]{
            new Question("Which company developed JavaScript?", new String[]{"Netscape", "Google", "Microsoft"}, 1),
            new Question("Which symbol is used for comments in JavaScript?", new String[]{"//", "/* */", "<!-- -->"}, 1)
        });

        // UI/UX Design
        addQuestions("Design Principles", new Question[]{
            new Question("What is the principle of proximity in design?", new String[]{"Elements that are close to each other are perceived to be related", "Elements that are far from each other are perceived to be related", "Proximity does not affect perception"}, 1),
            new Question("What is the main goal of UI design?", new String[]{"To create a visually appealing interface", "To make sure the interface is functional", "To ensure ease of use for users"}, 3)
        });

        addQuestions("User Research", new Question[]{
            new Question("What is the purpose of user research?", new String[]{"To understand user needs and behaviors", "To create a design prototype", "To test the final product"}, 1),
            new Question("Which method is commonly used in user research?", new String[]{"Surveys", "Sketching", "Coding"}, 1)
        });

        addQuestions("Prototyping", new Question[]{
            new Question("What is a prototype?", new String[]{"A final product", "A preliminary model of the product", "A user manual"}, 2),
            new Question("Which tool is widely used for prototyping?", new String[]{"Photoshop", "InVision", "Excel"}, 2)
        });

        // Java Programming
        addQuestions("Java Basics", new Question[]{
            new Question("What is Java?", new String[]{"A programming language", "A web browser", "An operating system"}, 1),
            new Question("Which keyword is used to declare a class in Java?", new String[]{"class", "Class", "public"}, 1)
        });

        addQuestions("OOP Concepts", new Question[]{
            new Question("What does OOP stand for?", new String[]{"Object-Oriented Programming", "Over-Ordered Programming", "Open-Source Programming"}, 1),
            new Question("Which is not an OOP concept in Java?", new String[]{"Encapsulation", "Inheritance", "Compilation"}, 3)
        });

        addQuestions("Advanced Java", new Question[]{
            new Question("Which of the following is not a Java feature?", new String[]{"Object-Oriented", "Use of pointers", "Platform Independent"}, 2),
            new Question("What is the use of the 'final' keyword in Java?", new String[]{"To mark a variable as unchangeable", "To define a method that cannot be overridden", "Both a and b"}, 3)
        });

        // Web Development
        addQuestions("Node.js", new Question[]{
            new Question("What is Node.js?", new String[]{"A JavaScript runtime", "A web server", "A database"}, 1),
            new Question("Which command is used to install Node.js packages?", new String[]{"npm install", "node install", "install package"}, 1)
        });
    }

    public void addQuestions(String subject, Question[] questions) {
        questionSet.put(subject, questions);
    }

    public Question[] getQuestions(String subject) {
        return questionSet.get(subject);
    }
}
