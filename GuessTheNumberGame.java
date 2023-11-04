import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random random = new Random();
        int Min = 1;
        int Max = 100;
        int MaxAttempts = 5;
        int Attempts = 0;
        boolean CorrectGuess = false;
        int Guesses = random.nextInt(Max - Min + 1) + Min;

        System.out.println("Welcome to the Guess the number Game!");
        System.out.println("I am Thinking of number Between " + Min + " and " + Max + "...");
        System.out.println("You have " + MaxAttempts + " attempts to guess the number.");

        // Game loop
        while (!CorrectGuess && Attempts < MaxAttempts) {
            System.out.println("Enter your Guess");
            int userGuess = obj.nextInt();
            Attempts++;
            if (userGuess < Min || userGuess > Max) {
                System.out.println("Please enter a number between " + Min + " and " + Max + ".");
            } else if (userGuess < Guesses) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > Guesses) {
                System.out.println("Too high! Try again");
            } else {
                CorrectGuess = true;
                System.out.println("Congratulations! You guessed the number in " + Attempts + " attempts");
            }
        }

        if (!CorrectGuess) {
            System.out.println("Sorry, you've run out of attempts. The secret number was " + Guesses + ".");
        }

        // Play again logic
        System.out.println("Do you want to play again? (Yes/No)");
        String PlayAgain = obj.next().toLowerCase();
        if (PlayAgain.equals("yes")) {
            System.out.println();
            main(args);
        } else {
            System.out.println("Thanks for playing");
        }
        obj.close();
    }
}
