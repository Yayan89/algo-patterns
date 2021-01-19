package sort;

import java.util.Arrays;

public class BubbleSort {
    // [20,-15,7,35,1,-22,55]
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 1, 55, -22};
        System.out.println(Arrays.toString(sort(array)));
    }

    //Best O(N) time O(1) Space
    //Worst O(N^2) O(1)
    private static int[] sort(int[] array) {
        if (array.length == 0) {
            return new int[] {};
        }

        boolean isSorted = false;
        int counter = 0;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1 - counter; i++) {
                if(array[i] > array[i+1]) {
                    int holder = array[i+1];
                    array[i+1] = array[i];
                    array[i] = holder;

                    isSorted = false;
                }
            }
            counter++;
        }
        return array;
    }


}