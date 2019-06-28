package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, 22};
        sort2(array);
    }

    private static void sort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex <= array.length - 1; firstUnsortedIndex++) {

            for (int k = 0; k < firstUnsortedIndex; k++) {
                if (array[k] > array[firstUnsortedIndex]) {
                    int holder = array[k];
                    array[k] = array[firstUnsortedIndex];
                    array[firstUnsortedIndex] = holder;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void sort2(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
