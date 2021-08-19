package lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSortingExample {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(911, 12, 35, -353, 0, 35, 67, 635));
        System.out.println("Unsorted array: " + myArray);
        Collections.sort(myArray);
        System.out.println("Sorted array: " + myArray);
    }
}
