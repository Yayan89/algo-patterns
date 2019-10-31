package datastructure.hashtables.bucketsort;

import java.util.*;

public class MainBucketSort {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int value : intArray) {
            System.out.println(value);
        }
    }

    private static void bucketSort(int[] input) {
        @SuppressWarnings("unchecked")
        List<Integer>[] buckets = new List[10];

        // using linked lists for the buckets
        // using arraylists as the buckets
        //            buckets[i] = new ArrayList<Integer>();
        Arrays.fill(buckets, new LinkedList<Integer>());

        //for the case of 95 & 92, it will be added in the same LinkedList
        for (int item : input) {
            buckets[hash(item)].add(item);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                input[j++] = value;
            }
            j = 0;
        }
    }

    private static int hash(int value) {
        return value / 10;
    }
}
