package arrays.longestpeak;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 43, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(array));

        array = new int[] {};
        System.out.println(longestPeak(array));

        array = new int[] {1, 3, 2};
        System.out.println(longestPeak(array));

        array = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(array));

        array = new int[] {1, 2, 3, 4, 5, 6, 10, 100, 1000};
        System.out.println(longestPeak(array));

        array = new int[] {1, 1, 1, 2, 3, 10, 12, -3, -3, 2, 3, 45, 800, 99, 98,
                0, -1, -1, 2, 3, 4, 5, 0, -1, -1};
        System.out.println(longestPeak(array));
    }

    public static int longestPeak(int[] array) {
        int longestPeakLength = 0;
        int i = 1;

        while (i < array.length - 1) {
            boolean isPeak = array[i - 1] < array[i] && array[i] > array[i + 1];

            if (!isPeak) {
                i += 1;
                continue;
            }

            int leftIndex = i - 2;
            while (leftIndex >= 0 && array[leftIndex] < array[leftIndex + 1]) {
                leftIndex -= 1;
            }

            int rightIndex = i + 2;
            while (rightIndex < array.length && array[rightIndex] < array[rightIndex - 1]) {
                rightIndex += 1;
            }

            int currentPeakLength = rightIndex - leftIndex - 1;
            if (currentPeakLength > longestPeakLength) {
                longestPeakLength = currentPeakLength;
            }
            i = rightIndex;
        }
        return longestPeakLength;
    }
}
