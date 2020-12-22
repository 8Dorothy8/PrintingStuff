import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner stringScan = new Scanner(System.in);
        Scanner intScan = new Scanner(System.in);
        Scanner boolScan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = stringScan.nextLine();

        System.out.println("Hello," + name);
        System.out.println("How old are you?");
        int age = intScan.nextInt();

        System.out.println("True/False, do you like action movies?");
        boolean likesAction= boolScan.nextBoolean();

        if (age<13 && likesAction) {
            System.out.println("You're not a teenager yet");
            System.out.println("We recommend watching The Incredibles");
        }

        else if (age<18 && likesAction) {
            System.out.println("Your ARE a teenager");
            System.out.println("We recommend watching Marvel");
        }
        else {
            System.out.println("You're an adult");
        }

        //Don't need to copy

       // Scanner intScan = new Scanner(System.in);
       // Scanner doubleScan = new Scanner(System.in);

        /* int a = intScan.nextInt();
        double b = doubleScan.nextDouble();
        System.out.println(a + b); */



    }
}
