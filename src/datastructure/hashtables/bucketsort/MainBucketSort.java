package datastructure.hashtables.bucketsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainBucketSort {
    public static void main(String[] args) {
        int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

        bucketSort(intArray);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        Arrays.fill(buckets, new ArrayList<>());

        for (int value : input) {
            buckets[hash(value)].add(value);
        }

        for(List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
    }

    private static int hash(int value) {
        return value / 10;
    }
}
