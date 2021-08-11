package lesson11;

import java.util.Scanner;

public class ArrayWorkInGroupFirst {
    public static void main(String[] args) {

        int[] array = {3, 4, 5, 7, 8};
        System.out.println("The first element is: " + array[0]);
        System.out.println("The last element is: " + array[array.length - 1]);
        System.out.println("The middle element is: " + array[array.length % 2 + 1]);

        double[] secondArray = {Math.random(), Math.random(), Math.random(), Math.random(), Math.random()};
        for (double i : secondArray) {
            System.out.println(i);
        }

        double sumOfSecondArray = 0;
        for (double i : secondArray) {
            sumOfSecondArray += i;
        }
        System.out.println("The sum of the array is " + sumOfSecondArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first element: ");
        int firstElement = scanner.nextInt();
        System.out.println("Please enter the last element: ");
        int lastElement = scanner.nextInt();

        double[] thirdArray = {firstElement, Math.random(), Math.random(), Math.random(), lastElement};
        for (double i : thirdArray){
            System.out.println(i);
        }

        double sumOfThirdArray = 0;
        for (double i : thirdArray) {
            sumOfThirdArray += i;
        }
        System.out.println("The sum of the array is " + sumOfThirdArray);
        System.out.println("The sum of the elements that were set by user input is " + (firstElement + lastElement));
    }
}