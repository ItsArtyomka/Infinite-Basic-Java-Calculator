/* Code Written by Artyom Pionov */

// Scanner import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        boolean calculatorRunning = true;

        // Running the calculator.
        Calculator.calculator();

        // Instructions after the first calculation
        System.out.println("Enter 'C' OR 'c' to start again...");
        System.out.println("Enter 'Q' OR 'q' to exit...");

        // Creating the Scanner object...
        Scanner userInput = new Scanner(System.in);

        // Reading the user input...
        char operation = userInput.next().charAt(0);

        // Looping the calculate() method...
        if (operation == 'Q' || operation == 'q') { calculatorRunning = false;}

        if (calculatorRunning){
            do {
                Calculator.calculator();
                System.out.println("Enter 'C' OR 'c' to start again...");
                System.out.println("Enter 'Q' OR 'q' to exit...");
                if (operation == 'Q' || operation == 'q') {
                    calculatorRunning = false;
                    System.out.println("Closing...");
                }
            } while (calculatorRunning);
        }
    }
}
