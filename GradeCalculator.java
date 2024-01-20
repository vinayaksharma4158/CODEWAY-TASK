import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        System.out.println("Enter the marks (out of 100) for each subject:");
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();

            // Validate input marks
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                i--; // Decrement i to re-enter marks for the same subject
            } else {
                totalMarks += marks;
            }
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects;

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
