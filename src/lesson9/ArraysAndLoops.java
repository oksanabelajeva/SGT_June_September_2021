package lesson9;

public class ArraysAndLoops {
    public static void main(String[] args) {
        int[] grades = {8, 9, 7, 8, 9, 9, 5, 8, 9, 1, 2, 9, 9, 10, 7, 8};
        int gradeSum = 0;

        for (int i = 0; i < grades.length; i++) {
            gradeSum += grades[i];
        }
        System.out.println("Sum of all the grades is " + gradeSum);

        double averageGrade = gradeSum / (double) grades.length;
        System.out.println("The average grade is " + averageGrade);

        // Circle K coffee
        for (int i = 0; i < 10000; i++) {
            if (i % 7 == 0) {
                System.out.println("This coffee is for free!");
            } else {
                System.out.println("You need to pay for this cup of coffee #" + i);
            }
        }
    }
}
