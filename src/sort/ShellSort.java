package sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        sort2(array);
    }

    private static void sort2(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int k = gap; k < array.length; k++) {
                int newElement = array[k];
                int j = k;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }

        for (int value : array) {
            System.out.println(value);
        }
    }

    //     int largest = array[gap];
    //            int i;
    //
    //            for (i = gap; i < array.length && array[i - 3] > array[i]; i++) {
    //                array[i] = array[i - 3];
    //            }
}
