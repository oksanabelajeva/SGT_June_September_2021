package lesson5;

import java.util.Scanner;

public class ScannerDuringLesson {
    public static void main(String[] args) {
        System.out.println("Application DATA INPUT has started!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("Your name is: " + scanner.nextLine());

        //Calculator
        System.out.println("Enter first number: ");
        double firstDigit = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondDigit = scanner.nextDouble();
        double resultOfSum = firstDigit + secondDigit;
        System.out.println("The result of sum is: " + resultOfSum);

        double resultOfSubtraction = firstDigit - secondDigit;
        System.out.println("The result of subtraction is: " + resultOfSubtraction);

        double resultOfMultiplication = firstDigit*secondDigit;
        System.out.println("The result of multiplication is: " + resultOfMultiplication);

        double resultOfDivision = firstDigit/secondDigit;
        System.out.println("The result of division: " + resultOfDivision);
    }
}