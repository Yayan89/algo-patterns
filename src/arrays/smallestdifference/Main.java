package arrays.smallestdifference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        //example [28,26] smallest difference

//        System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));

        arrayOne = new int[] {10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123};
        arrayTwo = new int[] {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530};
        //[-123,-124]
        System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));

    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int smallestDiff = Math.abs(Math.abs(arrayOne[0]) - Math.abs(arrayTwo[0]));
        int[] results = new int[2];

        for (int j : arrayOne) {
            for (int i : arrayTwo) {
                int currentDiff = Math.abs(Math.abs(j) - Math.abs(i));
                if (currentDiff <= smallestDiff || currentDiff == 1) {
                    smallestDiff = currentDiff;
                    results[0] = j;
                    results[1] = i;
                }
            }
        }
        return results;
    }
}
