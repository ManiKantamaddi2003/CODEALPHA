import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store student grades
        ArrayList<Integer> grades = new ArrayList<>();

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Input grades for each student
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate and display average, highest, and lowest grades
        if (!grades.isEmpty()) {
            double average = calculateAverage(grades);
            int highest = Collections.max(grades);
            int lowest = Collections.min(grades);

            System.out.println("\nAverage grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        } else {
            System.out.println("No grades entered.");
        }

        scanner.close();
    }

    // Method to calculate the average of an ArrayList of integers
    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
