package binarysearch;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] intArray = { -22, -15, 1 ,7 ,20, 35, 55 };
        System.out.println(recursiveBinarySearch(intArray, 55));
    }

    private static int recursiveBinarySearch(int[] input, int value) {
        int mid = input.length / 2;
        int end = input.length;
        int[] newArray = new int[input.length];

        if(newArray.length == 0) {
            return -1;
        }

        if(input[mid] < value) {
            newArray = Arrays.copyOfRange(input, mid + 1, end);
        } else if (input[mid] > value){
            newArray = Arrays.copyOfRange(input, 0, mid);
        } else if(input[mid] == value) {
            return 1;
        }
        return recursiveBinarySearch(newArray, value);
    }
}
