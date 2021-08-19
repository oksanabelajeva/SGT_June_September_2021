package lesson21;

public class ArrayBubbleSortRunningClass {
    public static void main(String[] args) {
        int arrayFirst[] = {3, 7, 5, 2, 1};
        int arraySecond[] = {34, 65, 21, 87, 3, 89, 0};
        int arrayThird[] = {-5, 7, 0, 23, -856, 7, 105};

        ArrayBubbleSort arrayToTestBubbleSort = new ArrayBubbleSort();
        System.out.print("First array before sorting is: ");
        arrayToTestBubbleSort.printArray(arrayFirst);
        arrayToTestBubbleSort.arrayBubbleSort(arrayFirst);
        System.out.print("First array after sorting is: ");
        arrayToTestBubbleSort.printArray(arrayFirst);

        System.out.print("Second array before sorting is: ");
        arrayToTestBubbleSort.printArray(arraySecond);
        arrayToTestBubbleSort.arrayBubbleSort(arraySecond);
        System.out.print("Second array after sorting is: ");
        arrayToTestBubbleSort.printArray(arraySecond);

        System.out.print("Third array before sorting is: ");
        arrayToTestBubbleSort.printArray(arrayThird);
        arrayToTestBubbleSort.arrayBubbleSort(arrayThird);
        System.out.print("Third array after sorting is: ");
        arrayToTestBubbleSort.printArray(arrayThird);

    }
}
