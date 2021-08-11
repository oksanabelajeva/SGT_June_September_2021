package lesson14;

import java.util.Scanner;

public class RegExLesson {

    // A*s -- Ananass - only letters
    // A.*s -- A12321321dsnfmmdsnfs - letters and numbers
    // ^StartsWith -- match StartsWithThisSentence
    // Contains only from alphanumeric a...z (lower case only)
    // [a-z]+
    // [a-zA-Z]
    // \\d == [0-9]

    public static void main(String[] args) {

        // TASK - validate this range; 1900-2100
        String validInput = "2020";
        String invalidInput = "99999";

        // build a patters to validate a year
        if (validInput.matches("\\d\\d\\d\\d")) {
            System.out.println("Valid input is a valid year.");
        } else {
            System.out.println("Valid input is not a valid year.");
        }

        if (invalidInput.matches("\\d\\d\\d\\d")) {
            System.out.println("Valid input is a valid year.");
        } else {
            System.out.println("Valid input is not a valid year.");
        }

        //
        if (validInput.matches("[1-2][019]\\d\\d")) {
            System.out.println("Valid input is a valid year. Enhanced validation rules.");
        } else {
            System.out.println("Valid input is not a valid year.");
        }

        // BETTER, but there are still some issues
        if ("2020".matches("[1-2][019]\\d\\d")) {
            System.out.println("Valid input is a valid year. Enhanced validation rules.");
        } else {
            System.out.println("Valid input is not a valid year.");
        }

        // Wow. Almost there. Year 2100 is still not valid.
        if ("2920".matches("[1-2][019]\\d\\d")) {
            System.out.println("Valid input is a valid year. Wow... passing values like 29xx");
        } else {
            System.out.println("Valid input is not a valid year.");
        }

        if ("1986".matches("(19|20)\\d\\d")) {
            System.out.println("Valid input is a valid year. Even 1986");
        } else {
            System.out.println("Valid input is not a valid year.");
        }

        if ("2100".matches("((19|20)\\d\\d|2100)")) {
            System.out.println("Valid input is a valid year. Even 2100");
        } else {
            System.out.println("Valid input is not a valid year.");
        }

        String[] cities = {"Copenhagen", "Paris", "Tokyo", "Bristol",
                "Mumbai", "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a search pattern: ");
        String userInput = scanner.next();
        for (String city : cities) {
            if (city.matches(".*" + userInput + ".*")) {
                System.out.println("This city matches the RegEx: \"" + userInput + "\" |" + city);
            }
        }

        // We can transform original input

        String transformedInput = userInput.toLowerCase();

        // CASE INSENSITIVE METHOD
        // LOWER CASE BOTH USER INPUT AND SEARCH ENTRY (CITY)
        for (String city : cities) {
            if (city.toLowerCase().matches(".*" + userInput.toLowerCase() + ".*")) {
                System.out.println("This city matches the RegEx: \"" + userInput + "\" |" + city);
            }
            // If you are not using a regex to match FIRST character
            if (city.toLowerCase().charAt(0) == userInput.toLowerCase().charAt(0)) {
                System.out.println("Comparing the first char");
            }
        }
    }
}