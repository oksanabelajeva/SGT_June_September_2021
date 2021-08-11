package lesson10;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        // Application that counts how many coffees we drink over the week
        System.out.println("TASK ONE");
        int[] coffeeArray = new int[7];
        coffeeArray[0] = 3;
        coffeeArray[1] = 4;
        coffeeArray[2] = 12;
        coffeeArray[3] = 2;
        coffeeArray[4] = 1;
        coffeeArray[5] = 0;
        coffeeArray[6] = 1;

        int coffeeCounter = 0;

        // Loops will help us to iterate over all elements in an Array
        for (int i = 0; i < coffeeArray.length; i++) {
            coffeeCounter += coffeeArray[i];
        }
        System.out.println("Total # of coffees during the week: " + coffeeCounter);
        System.out.println();

        System.out.println("TASK TWO");
        for (int i = 0; i < 5; i++) {
            System.out.println("Index: " + i);
        }
        System.out.println();

        System.out.println("TASK THREE");
        int[][] my2DArray = {{1, 2, 4, 7}, {11, 12, 13, 14}, {22, 23, 24, 5}};
        System.out.println("This is an element of row index=2 and column index=3: " + my2DArray[2][3]);
        System.out.println();

        System.out.println("TASK FOUR");
        //Group task by Artjoms
        int[][] myGroupTwoDArray = {{125, 55, 77}, {91, 5, 19}, {90, 211, 21}};
        for (int i = 0; i < myGroupTwoDArray[0].length; i++) {
            for (int j = 0; j < myGroupTwoDArray.length; j++) {
                System.out.println("Row: " + i + ", column: " + j + ", value: " + myGroupTwoDArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("TASK FIVE");
        // FOR EACH EXAMPLE
        int[] forLoopArray = {5, 6, 7, 1, 1};
        for (int internalValue : forLoopArray) {
            System.out.println("For loop element: " + internalValue);
        }
        System.out.println();

        System.out.println("TASK SIX");
        int[][] complex2DArray = {{5, 6}, {7, 8}};
        for (int[] singleRow : complex2DArray) {
            for (int singleElement : singleRow) {
                System.out.println("Just a single element from 2D array " + singleElement);
            }
        }
        System.out.println();

        System.out.println("TASK SEVEN");
        // WHILE LOOP EXAMPLE
        int clockTime = 0;

        while (clockTime <= 24) {
            System.out.println("The time is " + clockTime + " o'clock");
            clockTime += 3;
        }
        System.out.println();

        System.out.println("TASK EIGHT");
        // More complex example
        boolean runWhileLoop = true;

        while (runWhileLoop) {
            System.out.println("Variable runWhile Loop is still set to true. Therefore I am running.");
            if (clockTime > 10) {
                runWhileLoop = false;
            }
            clockTime++;
        }
        System.out.println();

        System.out.println("TASK NINE");
        // MENU EXAMPLE using while loop
        int menuItem = 101;

        Scanner scanner = new Scanner(System.in);

        while (menuItem != 0) {
            System.out.println("Please select an action you want to do:");
            System.out.println("1 - write that you are smart");
            System.out.println("2 - write that you are pretty");
            System.out.println("3 - write that you are the best!");
            System.out.println("0 - Exit the application ( but you are still the best ) ");
            menuItem = scanner.nextInt();

            if (menuItem == 1) {
                System.out.println("You are smart!");
            } else if (menuItem == 2) {
                System.out.println("You are pretty!");
            } else if (menuItem == 3) {
                System.out.println("You are the best!");
            } else {
                System.out.println("There is no such option!");
            }
        }
        System.out.println();

        System.out.println("TASK TEN");
        int initialValue = 10;
        // Will not run at all!
        while (initialValue < 5) {
            System.out.println("WHILE LOOP. INITIAL VALUE < 5");
        }
        System.out.println();

        System.out.println("TASK ELEVEN");
        // Will run only once
        do {
            System.out.println("DO WHILE LOOP. INITIAL VALUE < 5");
        } while (initialValue < 5);
    }
}
