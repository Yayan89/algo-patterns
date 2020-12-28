package arrays.threenumbersum;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        var targetSum = 0;
        //example [[-8,2,6], [-8,3,5], [-6,1,5]]
        List<Integer[]> integers = threeNumberSum3(array, targetSum);
        integers.forEach(integers1 -> System.out.println(Arrays.toString(integers1)));

        array = new int[] {1, 2, 3};
        targetSum = 6;
        integers = threeNumberSum3(array, targetSum);
        integers.forEach(integers1 -> System.out.println(Arrays.toString(integers1)));

        array = new int[] {1, 2, 3};
        targetSum = 7;
        integers = threeNumberSum3(array, targetSum);
        integers.forEach(integers1 -> System.out.println(Arrays.toString(integers1)));

        array = new int[] {8, 10, -2, 49, 14};
        targetSum = 57;
        integers = threeNumberSum3(array, targetSum);
        integers.forEach(integers1 -> System.out.println(Arrays.toString(integers1)));
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        //Time O(Nlog(N))
        Arrays.sort(array);
        //array = {-8, -6, 1, 2, 3, 5, 6, 12};  result = 0 [-8, 2, 6], [-8, 3, 5], [-6, 1, 5]

        //Time O(N^3) 3x for-loops
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int z = j + 1; z <= array.length - 1; z++) {
                    if (array[i] + array[j] + array[z] == targetSum) {
                        result.add(new Integer[] {array[i], array[j], array[z]});
                    }
                }
            }
        }
        return result;
    }

    //This does not work, when i = -6, it will skip
    public static List<Integer[]> threeNumberSum1(int[] array, int targetSum) {
        //Time O(Nlog(N))
        Arrays.sort(array);
        //array = {-8, -6, 1, 2, 3, 5, 6, 12};  result = 0 [-8, 2, 6], [-8, 3, 5], [-6, 1, 5]

        //-6 + 1 = -5 + 12 = 17 > 0
        //-8 + 1 = -7  + 12  = 5 > 0
        //-8 + 2 = -6  + 12  = 6 > 0
        //-8 + 3 = -5  + 12  = 7 > 0

        List<Integer[]> list = new ArrayList<>();
        int lastIndex = array.length - 1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                int lastNum = array[lastIndex];

                if (lastIndex < j) {
                    break;
                }

                if (array[i] + array[j] + lastNum == targetSum) {
                    list.add(new Integer[] {array[i], array[j], lastNum});
                    lastIndex--;
                } else if (array[i] + array[j] + lastNum > targetSum) {
                    lastIndex--;
                }
            }
            lastIndex = array.length - 1;
        }
        return list;
    }


    public static List<Integer[]> threeNumberSum3(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<>();
        //array = {-8, -6, 1, 2, 3, 5, 6, 12};  result = 0 [-8, 2, 6], [-8, 3, 5], [-6, 1, 5]

        //O(N^2) T
        //O(N) S
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    Integer[] newTriplet = {array[i], array[left], array[right]};
                    triplets.add(newTriplet);
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets;
    }
}