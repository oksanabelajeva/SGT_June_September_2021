package lesson21;

public class ArrayBubbleSort {

    public void arrayBubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int checkedNumber = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = checkedNumber;
                }
            }
        }
    }

    public void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
