import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberOfAttempts = 5; // You can adjust this as needed
        int score = 0;

        do {
            int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + ":");

            while (attempts < numberOfAttempts) {
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += numberOfAttempts - attempts + 1; // Adjust the scoring as needed
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (attempts < numberOfAttempts) {
                    System.out.println("Attempts left: " + (numberOfAttempts - attempts));
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing! Your total score is: " + score);
                break;
            }

        } while (true);

        scanner.close();
    }
}



