package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,22};
        sort(array);
    }

    private static void sort(int[] array) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex <= array.length -1; firstUnsortedIndex++) {

            for(int k = 0; k < firstUnsortedIndex; k++) {
                if(array[k] > array[firstUnsortedIndex]) {
                    int holder = array[k];
                    array[k] = array[firstUnsortedIndex];
                    array[firstUnsortedIndex] = holder;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
