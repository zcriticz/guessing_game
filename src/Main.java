import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int machineNumber = new Random().nextInt(100);
        int yourNumber = 0;
        int attempts = 0;

        while (attempts < 5) {
            System.out.println("Please enter your number");
            yourNumber = inputValue.nextInt();
            attempts++;
            if (yourNumber == machineNumber) {
                System.out.println("Congratulations! You have found the number in " + attempts + " attempts.");
            } else if (yourNumber < machineNumber) {
                System.out.println("Please enter a higher number.");
            } else {
                System.out.println("Please enter a lower number.");
            }
        }
        if (attempts == 5) {
            System.out.println("You have used all your rights. The number was " + machineNumber);
        }
    }
}