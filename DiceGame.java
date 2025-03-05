import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 * @author  Alex Kapajika
 * @version 1.0
 * @since   2025-03-03
 */

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(6) + 1; // Generates a number between 1 and 6
        int numberOfGuesses = 0;
        int userGuess = 0;
        boolean correctGuess = false;
        while (!correctGuess) {
            System.out.print("Enter a number between 1 - 6: ");
            try {
                userGuess = scanner.nextInt();
                numberOfGuesses++;
                if (userGuess < 1 || userGuess > 6) {
                    System.out.println("Please enter a number between 1 and 6.");
                } else if (userGuess == numberToGuess) {
                    correctGuess = true;
                    System.out.println("You guessed the right number: " + numberToGuess);
                    System.out.println("It took you " + numberOfGuesses + " guess(es)");
                } else {
                    System.out.println("Incorrect guess, try again!");
                }
            } catch (InputMismatchException e) {
                System.out.println("This input is not a number. Please enter a valid number between 1 and 6.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.close();
    }
}
