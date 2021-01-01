package arrays.longestpeak;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 43, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(array));

        array = new int[] {};
        System.out.println(longestPeak(array));

        array = new int[] {1, 3, 2};
        System.out.println(longestPeak(array));

        array = new int[] {1, 2, 3, 4, 5, 6, 10, 100, 1000};
        System.out.println(longestPeak(array));

        array = new int[] {1, 1, 1, 2, 3, 10, 12, -3, -3, 2, 3, 45, 800, 99, 98,
                0, -1, -1, 2, 3, 4, 5, 0, -1, -1};
        System.out.println(longestPeak(array));
    }

    public static int longestPeak(int[] array) {
        // Write your code here.
        return -1;
    }
}
