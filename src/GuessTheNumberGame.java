import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) throws Exception {

        Random random = new Random();

        // Choosing a random number from 1 to 100 :)
        int randomNumber = random.nextInt(101);

        // Variables... :D
        int NumberofTries = 0;
        boolean HasGuessCorrect = false;

        // Speeches
        System.out.println("Welcome To The Guess the number game!!!!!! ");
        System.out.println("I have selected a random number from 0 to 100...  ");

        // Scanner class :(
        Scanner scanner = new Scanner(System.in);

        while (!HasGuessCorrect) {
            System.out.println("Enter Your Guess: ");
            int UserGuess = scanner.nextInt();

            NumberofTries++;

            if (UserGuess < randomNumber) {
                System.out.println("Higher");
            } else if (UserGuess > randomNumber) {
                System.out.println("Lower");
            } else if (UserGuess == randomNumber) { 
                System.out.println("Congrats You Got in " + NumberofTries + " tries");
            } else {

            }

        }

    }

}
