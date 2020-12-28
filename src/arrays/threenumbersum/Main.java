package arrays.threenumbersum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        var targetSum = 0;
        //example [[-8,2,6], [-8,3,5], [-6,1,5]]
        List<Integer[]> integers = threeNumberSum(array, targetSum);
        integers.forEach(integers1 -> System.out.println(Arrays.toString(integers1)));

        array = new int[] {1, 2, 3};
        targetSum = 6;
        integers = threeNumberSum(array, targetSum);
        integers.forEach(integers1 -> System.out.println(Arrays.toString(integers1)));
//
//        array = new int[] {1, 2, 3};
//        targetSum = 7;
//        integers = threeNumberSum(array, targetSum);
//        integers.forEach(integers1 -> System.out.println(Arrays.toString(integers1)));

//        array = new int[] {8, 10, -2, 49, 14};
//        targetSum = 57;
//        List<Integer[]> integers = threeNumberSum(array, targetSum);
//        integers.forEach(integers1 -> System.out.println(Arrays.toString(integers1)));
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        //Time O(Nlog(N))
        Arrays.sort(array);

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
}
