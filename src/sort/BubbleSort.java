package sort;

import java.util.Arrays;

public class BubbleSort {
    // [20,-15,7,35,1,-22,55]
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 1, 55, -22};
        sort(array);
    }

    private static void sort(int[] array) {

        //1. get the whole array
        for (int i = array.length - 1; i > 0; i--) {
            //for each element in array
            for (int k = 0; k < i; k++) {
                if (array[k] > array[k + 1]) {
                    int holder = array[k]; //20
                    array[k] = array[k+1]; //
                    array[k+1] = holder;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}