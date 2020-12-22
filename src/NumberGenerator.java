import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        Scanner intScan = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Guess a number between 0-100");
        int number;
        int guess = 101;
        number = generator.nextInt(101);
        while (guess != number) {
            guess = intScan.nextInt();

            if (guess > number) {
                System.out.println("That's too high, guess a smaller number");
            } else if (guess < number) {
                System.out.println("That's too low, guess a larger number");
            } else {
                System.out.println("Yay, you got the magical number");
            }
        }
    }
}
