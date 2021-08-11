package lesson5;

public class MathSecondQuiz {
    public static void main(String[] args) {
        double radius = 7.5;
        double circleArea = Math.PI * (Math.pow(radius, 2));
        System.out.println(Math.round(circleArea));

        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println(circlePerimeter);

        int a = 3;
        int b = 5012;
        int c = 623;
        int d = 2;
        int sum = a + b + c + d;
        int average = sum / 4;
        System.out.println(average);

        double width = 5.5;
        double height = 8.5;
        double rectangleArea = width * height;
        System.out.println(rectangleArea);

        double rectanglePerimeter = 2 * (width + height);
        System.out.println(rectanglePerimeter);

        int toCalculateSumOfDigits = 25;
        int digit;
        double sumOfDigits = 0;
        digit = toCalculateSumOfDigits % 10;
        sumOfDigits = sumOfDigits + digit;
        digit = toCalculateSumOfDigits /10;
        sumOfDigits = sumOfDigits + digit;
        System.out.println(sumOfDigits);
    }
}