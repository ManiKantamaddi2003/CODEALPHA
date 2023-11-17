import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private ArrayList<String> options;
    private int correctOptionIndex;

    public Question(String questionText, ArrayList<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public boolean isCorrect(int selectedOption) {
        return selectedOption == correctOptionIndex;
    }
}

class Quiz {
    private ArrayList<Question> questions;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);

            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestionText());
            ArrayList<String> options = currentQuestion.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            System.out.println("--------------------------------------------------");

            if (currentQuestion.isCorrect(userAnswer)) {
                System.out.println("Correct! Your answer: " + userAnswer);
                score++;
            } else {
                System.out.println("Incorrect. Your answer: " + userAnswer + ". The correct answer was: "
                        + currentQuestion.getCorrectOptionIndex());
            }

            System.out.println("--------------------------------------------------");
        }

        System.out.println("Quiz completed. Your score: " + score + " out of " + questions.size());
    }
}

public class OnlineQuizPlatform {
    public static void main(String[] args) {
        // Example questions
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the default value of the byte data type in Java?",
        new ArrayList<>(List.of("0", "1", "-1", "Null")), 1));
questions.add(new Question("What is the difference between '==' and '.equals()' in Java?",
        new ArrayList<>(List.of("They are identical", "==' compares references, .equals() compares values",
                "==' compares values, .equals() compares references", "None of the above")), 3));
questions.add(new Question("What is the purpose of the 'super' keyword in Java?",
        new ArrayList<>(List.of("To refer to the immediate parent class object", "To call a superclass method",
                "To create an instance of the superclass", "All of the above")), 4));
questions.add(new Question("What is the Java Virtual Machine (JVM)?",
        new ArrayList<>(List.of("A compiler", "An interpreter", "A virtual machine that runs Java bytecode",
                "A tool for debugging Java code")), 3));
questions.add(new Question("What is the output of 'System.out.println(3 + 5 + \"Java\")'?",
        new ArrayList<>(List.of("35Java", "8Java", "Syntax error", "Java8")), 2));
questions.add(new Question("What is the purpose of the 'this' keyword in Java?",
        new ArrayList<>(List.of("To refer to the current instance of the class", "To call a method of the superclass",
                "To create a new instance of the class", "To refer to the parent class object")), 1));
questions.add(new Question("Which of the following is NOT a primitive data type in Java?",
        new ArrayList<>(List.of("int", "float", "char", "string")), 4));
questions.add(new Question("What is the purpose of the 'break' statement in Java?",
        new ArrayList<>(List.of("To end the execution of a loop or switch statement", "To skip the current iteration of a loop",
                "To exit the entire program", "To continue to the next iteration of a loop")), 1));
questions.add(new Question("How do you declare a constant in Java?",
        new ArrayList<>(List.of("const int MAX_VALUE = 100;", "final int MAX_VALUE = 100;", "static final int MAX_VALUE = 100;",
                "int MAX_VALUE = 100;")), 3));
questions.add(new Question("What is the role of the 'finally' block in exception handling?",
        new ArrayList<>(List.of("To catch and handle exceptions", "To specify the exception type", "To guarantee execution regardless of whether an exception occurs or not",
                "To indicate the end of the try-catch block")), 3));
questions.add(new Question("What is the difference between 'String' and 'StringBuilder' in Java?",
        new ArrayList<>(List.of("String is immutable, StringBuilder is mutable", "String is mutable, StringBuilder is immutable",
                "Both are immutable", "Both are mutable")), 1));
questions.add(new Question("Which of the following is a valid declaration of a two-dimensional array in Java?",
        new ArrayList<>(List.of("int[][] array = new int[3,3];", "int[][] array = new int[3][3];",
                "int array[][] = new int[3][3];", "int array[3][3] = new int[];")), 2));
questions.add(new Question("What is the purpose of the 'instanceof' operator in Java?",
        new ArrayList<>(List.of("To compare two objects for equality", "To check if an object is an instance of a particular class",
                "To access the instance variables of an object", "To cast an object to a specific class")), 2));
questions.add(new Question("Which Java keyword is used to define a package?",
        new ArrayList<>(List.of("package", "import", "class", "public")), 1));
questions.add(new Question("What is the default value of the boolean data type in Java?",
        new ArrayList<>(List.of("true", "false", "null", "0")), 2));
questions.add(new Question("How do you prevent a method from being overridden in Java?",
        new ArrayList<>(List.of("Use the 'final' modifier", "Use the 'private' modifier", "Use the 'static' modifier",
                "It cannot be prevented")), 1));
questions.add(new Question("Which design principle promotes the creation of interfaces in Java?",
        new ArrayList<>(List.of("Encapsulation", "Polymorphism", "Inheritance", "Composition")), 4));
questions.add(new Question("What is the purpose of the 'static' keyword in Java?",
        new ArrayList<>(List.of("To create an instance of a class", "To declare a constant", "To indicate that a variable or method belongs to the class, not to instances of the class",
                "To make a class abstract")), 3));
questions.add(new Question("What is the difference between 'throw' and 'throws' in Java?",
        new ArrayList<>(List.of("'throw' is used to explicitly throw an exception, 'throws' is used to declare exceptions that a method might throw",
                "'throw' is used to declare exceptions that a method might throw, 'throws' is used to explicitly throw an exception",
                "'throw' and 'throws' are interchangeable", "None of the above")), 1));
                questions.add(new Question("What is the purpose of the 'interface' keyword in Java?",
                new ArrayList<>(List.of("To define a class", "To create an instance of a class", "To declare a constant",
                        "To declare a contract that implementing classes must follow")), 4));
        questions.add(new Question("What is the role of the 'try', 'catch', and 'finally' blocks in exception handling?",
                new ArrayList<>(List.of("try: handling exceptions, catch: specifying the exception type, finally: guaranteeing execution",
                        "try: guaranteeing execution, catch: handling exceptions, finally: specifying the exception type",
                        "try: handling exceptions, catch: guaranteeing execution, finally: specifying the exception type",
                        "try: specifying the exception type, catch: guaranteeing execution, finally: handling exceptions")), 1));
        questions.add(new Question("What is method overloading in Java?",
                new ArrayList<>(List.of("Creating multiple methods with the same name but different parameters in the same class",
                        "Creating multiple methods with the same name and the same parameters in the same class",
                        "Creating multiple methods with different names but the same parameters in the same class",
                        "Creating multiple methods with different names and different parameters in different classes")), 1));
                        questions.add(new Question("What is the difference between 'public', 'private', 'protected', and 'default' access modifiers?",
                        new ArrayList<>(List.of(
                                "'public': accessible from anywhere",
                                "'private': accessible only within the same class",
                                "'protected': accessible within the same package and subclasses",
                                "'default': accessible within the same package")), 1));
                
                questions.add(new Question("What is the purpose of the 'super' keyword in constructor chaining?",
                        new ArrayList<>(List.of(
                                "To call the superclass constructor",
                                "To create a new instance of the superclass",
                                "To refer to the immediate parent class object",
                                "To access the instance variables of the superclass")), 1));
                
                new ArrayList<>(List.of("To call the superclass constructor", "To create a new instance of the superclass",
                        "To refer to the immediate parent class object", "To access the instance variables of the superclass"));
        questions.add(new Question("How does Java support multiple inheritance?",
                new ArrayList<>(List.of("Using interfaces", "Using abstract classes", "Using final classes", "Java does not support multiple inheritance")),
                        1));
        questions.add(new Question("What is a Java annotation?",
                new ArrayList<>(List.of("A comment in the code", "A special type of loop", "A type of exception", "Metadata added to Java code")), 4));
        questions.add(new Question("What is the 'hashCode()' method used for in Java?",
                new ArrayList<>(List.of("To generate a random number", "To compare two objects for equality", "To return the hash code value of an object",
                        "To calculate the length of a string")), 3));
        questions.add(new Question("What is the purpose of the 'volatile' keyword in Java?",
                new ArrayList<>(List.of("To declare a constant", "To indicate that a variable can be accessed by multiple threads",
                        "To make a variable immutable", "To prevent a variable from being garbage collected")), 2));
        questions.add(new Question("What is the 'NullPointerException' in Java?",
                new ArrayList<>(List.of("An exception thrown when an object is accessed before it is initialized", "An exception thrown when dividing by zero",
                        "An exception thrown when accessing a non-existent file", "An exception thrown when a null value is passed to a method")), 1));
        questions.add(new Question("How can you achieve runtime polymorphism in Java?",
                new ArrayList<>(List.of("By using interfaces", "By using abstract classes", "By using inheritance", "All of the above")), 4));
        questions.add(new Question("What is the 'equals()' method used for in Java?",
                new ArrayList<>(List.of("To compare two objects for equality", "To check if an object is an instance of a particular class",
                        "To create a new instance of a class", "To declare a constant")), 1));
        questions.add(new Question("What is the purpose of the 'static' block in Java?",
                new ArrayList<>(List.of("To create an instance of a class", "To initialize static variables", "To declare a constant",
                        "To create an object")), 2));
        questions.add(new Question("What is the difference between '==', 'equals()', and 'compareTo()' in Java?",
                new ArrayList<>(List.of("'==' is used for reference equality, 'equals()' is used for value equality, 'compareTo()' is used for comparing objects",
                        "'==' is used for value equality, 'equals()' is used for reference equality, 'compareTo()' is used for comparing objects",
                        "'==' is used for value equality, 'equals()' is used for comparing objects, 'compareTo()' is used for reference equality",
                        "'==' is used for comparing objects, 'equals()' is used for reference equality, 'compareTo()' is used for value equality")), 1));
        questions.add(new Question("What is the purpose of the 'StringBuffer' class in Java?",
                new ArrayList<>(List.of("To create mutable strings", "To create immutable strings", "To concatenate strings", "To reverse strings")), 1));
        questions.add(new Question("What is the difference between 'transient' and 'volatile' keywords in Java?",
                new ArrayList<>(List.of("'transient' is used to declare a variable that should not be serialized, 'volatile' is used to indicate that a variable can be accessed by multiple threads",
                        "'transient' is used to indicate that a variable can be accessed by multiple threads, 'volatile' is used to declare a variable that should not be serialized",
                        "'transient' is used to create an instance of a class, 'volatile' is used to create an array of objects",
                        "'transient' is used to declare a constant, 'volatile' is used to create an instance of a class")), 1));
        questions.add(new Question("What is the purpose of the 'instanceof' operator in Java?",
                new ArrayList<>(List.of("To compare two objects for equality", "To check if an object is an instance of a particular class",
                        "To access the instance variables of an object", "To cast an object to a specific class")), 2));
        questions.add(new Question("How does Java handle memory management?",
                new ArrayList<>(List.of("Using manual memory allocation and deallocation", "By relying on the operating system for memory management",
                        "Using garbage collection", "By declaring variables with fixed memory sizes")), 3));
        questions.add(new Question("What is the purpose of the 'finalize()' method in Java?",
                new ArrayList<>(List.of("To finalize the value of a variable", "To indicate the end of a program", "To perform cleanup operations before an object is garbage collected",
                        "To check if an object is eligible for garbage collection")), 3));
        questions.add(new Question("What is the purpose of the 'break' statement in Java?",
                new ArrayList<>(List.of("To end the execution of a loop or switch statement", "To skip the current iteration of a loop",
                        "To exit the entire program", "To continue to the next iteration of a loop")), 1));
        questions.add(new Question("What is the difference between 'float' and 'double' data types in Java?",
                new ArrayList<>(List.of("'float' is a 32-bit data type, 'double' is a 64-bit data type",
                        "'float' is a 64-bit data type, 'double' is a 32-bit data type",
                        "'float' is used for integer values, 'double' is used for floating-point values",
                        "'float' is used for double-precision values, 'double' is used for single-precision values")), 1));
        questions.add(new Question("What is the purpose of the 'Math.random()' method in Java?",
                new ArrayList<>(List.of("To generate a random number between 0 and 1", "To round a floating-point number to the nearest integer",
                        "To calculate the square root of a number", "To find the maximum value between two numbers")), 1));
        

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
