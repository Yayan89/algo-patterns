package twoNumberSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, -1, 6};
        System.out.println(Arrays.toString(twoNumberSum(array, 10)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        //Time: O(N^2)
        //Space: O(1)
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j : array) {
                if (array[i] + j == targetSum) {
                    return new int[] {array[i], j};
                }
            }
        }
        return new int[0];
    }

    //alternative
    public static int[] twoNumberSum1(int[] array, int targetSum) {
        //Time: O(N^2)
        //Space: O(1)
        for (int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetSum) {
                    return new int[] {firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        //Time O(N)
        //Space O(N)
        Set<Integer> nums = new HashSet<>();
        for (int i : array) {
            nums.add(i);
            int potentialMatch = targetSum - i;

            if (nums.contains(potentialMatch)) {
                return new int[] {i, potentialMatch};
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum3(int[] array, int targetSum) {
        //Time O(Nlog(N))
        //Space O(1)
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                return new int[] {array[left], array[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }


}