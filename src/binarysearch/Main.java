package binarysearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = { -22, -15, 1 ,7 ,20, 35, 55 };
        System.out.println(recursiveBinarySearch(intArray, 55));
        System.out.println(recursiveBinarySearch(intArray, -22));
        System.out.println(recursiveBinarySearch(intArray, 7));
        System.out.println(recursiveBinarySearch(intArray, 60));
    }

    private static int recursiveBinarySearch(int[] input, int value) {
        int mid = input.length / 2;
        int end = input.length;

        //if it does not exist
        if(input.length == 0) {
            return -1;
        }
        //if it exist
        if(input[mid] == value) {
            return 1;
        }

        if(input[mid] < value) {
            input = Arrays.copyOfRange(input, mid + 1, end);
            return recursiveBinarySearch(input, value);
        } else {
            input = Arrays.copyOfRange(input, 0, mid);
            return recursiveBinarySearch(input, value);
        }
    }
}
