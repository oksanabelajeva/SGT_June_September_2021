package lesson11;

public class ArrayWorkInGroupSecond {
    public static void main(String[] args) {
        int[] arrayOfTenIntegers = {2, 4, 5, 6, 3, 9, 10, 2, 9, 8};
        int sum = 0;
        for (int i : arrayOfTenIntegers) {
            if (i % 2 != 0) {
                System.out.println("The odd element is " + i + ".");
                sum += i;
            }
        }
        System.out.println("The sum of all elements is " + sum + ".");

        //MAXIMUM
        int max = arrayOfTenIntegers[0];
        for (int i = 0; i < arrayOfTenIntegers.length; i++) {
            if (arrayOfTenIntegers[i] > max) {
                max = arrayOfTenIntegers[i];
            }
        }
        System.out.println("The biggest element is " + max + ".");

        //MINIMUM
        int min = arrayOfTenIntegers[0];
        for (int i = 0; i < arrayOfTenIntegers.length; i++) {
            if (arrayOfTenIntegers[i] < min) {
                min = arrayOfTenIntegers[i];
            }
        }
        System.out.println("The smallest element is " + min + ".");
    }
}