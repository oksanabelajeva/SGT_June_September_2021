package lesson13;

public class StringLesson {
    public static void main(String[] args) {
        String firstString = "abc";
        //String errorString ='abc';
        String secondString = "abc";
        String lowerCaseName = "Oxana";
        String capitalCaseName = "OXANA";

        String loremIpsumString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas a ante non velit pharetra placerat ut sed mauris. Maecenas aliquam, lorem at ultricies accumsan, sapien nisl aliquet justo, non volutpat lorem libero eget lacus. Duis eleifend ante leo, ut viverra lorem blandit id. Pellentesque elementum metus eu nibh tempus imperdiet. In interdum quis eros non hendrerit. Nullam aliquet justo non ex condimentum vulputate. Nullam aliquet cursus elit. In eu imperdiet lectus. Donec at tincidunt nisi. Nunc pulvinar arcu purus, eu rhoncus ex semper euismod. ";
        System.out.println("Length of Lorem Ipsum string is : " + loremIpsumString.length() + " characters.");
        System.out.println("Character at position 159 is: " + loremIpsumString.charAt(159));

        System.out.println("These two variables ARE NOT identical: " + firstString.equals(loremIpsumString));
        System.out.println("These two variables ARE identical: " + firstString.equals(secondString));

        System.out.println("Case sensitive equals method: " + lowerCaseName.equals(capitalCaseName));
        System.out.println("Case IN-sensitive equals method: " + lowerCaseName.equalsIgnoreCase(capitalCaseName));

        //REGEX + matches()
        System.out.println("This should match a word /Lorem/ " + loremIpsumString.matches("Lorem.*"));

        //REGEX starts of the string
        System.out.println(loremIpsumString.matches("^consectetur.*"));
        //REGEX ends with some text
        System.out.println(loremIpsumString.matches("consectetur$"));
        // Third character+ == Lorem, like "ABLorem ipsum"
        //loremIpsumString.matches("\w\wLorem");

        //PARSING
        String measurementA = "10";
        byte parsedMeasurementA = Byte.parseByte(measurementA);
        System.out.println("Measurement A was: " + measurementA);
        System.out.println("Measurement A after parsing became: " + parsedMeasurementA);
        System.out.println("New measurement A is doubled and became: " + parsedMeasurementA * 2);

        String measurementB = "105.214567";
        double parsedMeasurementB = Double.parseDouble(measurementB);
        System.out.println("Parsed measurement B is divided by two and became: " + parsedMeasurementB / 2);

        // NOT POSSIBLE TO PARSE STRING TO NUMBER IF TEXT CONTAINS NUMBERS AND TEXT
        // String measurementC = "105.1234 Error. Error. Something is wrong!";
        // double erroredMeasurement = Double.parseDouble(measurementC);
        // System.out.println("Errored measurement: " + erroredMeasurement);
        // OUTPUT - Exception in thread "main" java.lang.NumberFormatException: For input string: "105.1234 Error. Error. Something is wrong!"

        if (firstString.charAt(0) == 'a') {
            System.out.println("Variable starts with letter 'a'.");
        } else {
            System.out.println("Variable does not start with letter 'a'.");
        }

        String trueVariable = "true";
        if (Boolean.parseBoolean(trueVariable)) {
            System.out.println("Variable trueVariable consists of TRUE.");
        }

        // ALWAYS if (true)
        String falseVariable = "false";
        if (Boolean.parseBoolean(falseVariable)) {
            System.out.println("This condition will never execute.");
        } else {
            System.out.println("But this condition will execute.");
        }

        //FORMATTING
        System.out.println(String.format("This is a simple text. And this is a floating number %f. Cool! Right?", 108.2345f));
        System.out.println(String.format("This is a simple text. And this is a floating number %f. Cool! Right?", 108.23457896f));

        // PUT 2 DIGITS AFTER A COMMA
        float floatDigits = 20123.1234567890f;
        System.out.println(String.format("Here are two digits after a comma: %.2f", floatDigits));
        System.out.println(String.format("Here are five digits after a comma: %.5f", floatDigits));

        char myChar = 'Z';
        short myShort = 1900;
        String myString = "My String";
        System.out.println(String.format("String: %s, %nDecimal: %d, %nChar: %c", myString, myShort, myChar));

        // NULL and References
        String myName = "Oxana";
        System.out.println(myName);
        myName = null;
        System.out.println(myName);

        String bankIBAN1 = "LV30UNLA0987654321231";
        String bankIBAN2 = "LV300UNLA098765432123";

        //true
        if (bankIBAN1.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}")) {
            System.out.println("Bank IBAN1 is correct.");
        }
        //false
        if (bankIBAN2.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}")) {
            System.out.println("Bank IBAN2 is correct.");
        } else {
            System.out.println("Bank IBAN2 is incorrect.");
        }
    }
}