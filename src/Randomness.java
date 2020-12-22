import java.util. Scanner;
import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
       Scanner intScan = new Scanner(System.in);
       Random rng = new Random();

       int randomNumber = rng.nextInt( 1000);  //Generates 0-999
       double randomDouble = rng.nextDouble() * 100;        //Generates [0-100);
        boolean randomBoolean = rng.nextBoolean();      //Generates true or false

       System.out.println("random number:" + randomNumber);
        System.out.println("random number:" + randomDouble);
        System.out.println("random number:" + randomBoolean);
    }
}
