package lesson7;

import java.util.Scanner;

public class ScannerOfDaysToGetAMonth {

    public static void main(String[] args) {
        short day;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a day");
        day = scanner.nextShort();

        System.out.println("The day number is: " + day);

        if (day < 0){
            System.out.println("Day can't be negative");
        }
        else if (day > 365){
            System.out.println("Day can't be larger than 365");
        }
        else {
            short month = (short) (Math.ceil(day / 30d));
            switch(month) {
                case 1:
                    System.out.println("It is January");
                    break;
                case 2:
                    System.out.println("It is February");
                    break;
            }
        }
    }
}
