import java.util.Random;
import java.util.Scanner;

class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 15;
        int score = 0;

        System.out.println("Welcome to the Guess the Number game You want to play!");
        System.out.println("I've picked a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        while (true) {
            int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess Number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println(
                            "Congratulations! You guessed the number is MindBlowing " + secretNumber + " correctly!");
                    score += maxAttempts - attempts + 1;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Try a higher number...ohh noo");
                } else {
                    System.out.println("Try a lower number...ohh noo");
                }

                if (attempts == maxAttempts) {
                    System.out
                            .println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
                }
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Your total score You Obtain: " + score);
                System.out.println("Thanks for playing Game! Bye Bye See You Next Time!");
                break;
            }
        }
        scanner.close();
    }
}