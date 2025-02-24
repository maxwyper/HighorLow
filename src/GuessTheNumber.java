import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 10 (inclusive)
        int randomNumber = random.nextInt(10) + 1;

        int userGuess = -1;

        // Loop to validate the user's guess (must be an integer between 1 and 10)
        do {
            System.out.print("Guess the number (between 1 and 10): ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Your guess must be between 1 and 10. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        } while (userGuess < 1 || userGuess > 10);

        // Display the random number and the result of the guess
        System.out.println("The number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed it right!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is too low. Try again!");
        } else {
            System.out.println("Your guess is too high. Try again!");
        }

        scanner.close();
    }
}
