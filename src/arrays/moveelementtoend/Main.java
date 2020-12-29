package arrays.moveelementtoend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        var toMove = 2;
        //example (1,3,4,2,2,2,2,2)
        moveElementToEnd(integers, toMove).forEach(System.out::print);

        integers = Collections.emptyList();
        toMove = 3;
        moveElementToEnd(integers, toMove).forEach(System.out::print);

        integers = Arrays.asList(2, 4, 2, 5, 6, 2, 2);
        toMove = 2;
        moveElementToEnd1(integers, toMove).forEach(System.out::print);
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        //O(N) T
        //(O(1) S
        if (array.isEmpty()) {
            return array;
        }

        int currentIndex = 0;
        int lastIndex = array.size() - 1;

        while (currentIndex <= lastIndex) {
            if (array.get(lastIndex) != toMove && array.get(currentIndex) != toMove) {
                currentIndex++;
                continue;
            }

            if (array.get(lastIndex) != toMove) {
                int last = array.get(lastIndex);
                int first = array.get(currentIndex);
                array.set(currentIndex, last);
                array.set(lastIndex, first);
                currentIndex++;
            }
            lastIndex--;
        }
        return array;
    }

    public static List<Integer> moveElementToEnd1(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;

        while (i < j) {
            //good while-condition
            while (i < j && array.get(j) == toMove) {
                j--;
            }
            if (array.get(i) == toMove) {
                swap(i, j, array);
            }
            i++;
        }
        return array;
    }

    private static void swap(int i, int j, List<Integer> array) {
        int temp = array.get(j);
        array.set(j, array.get(1));
        array.set(i, temp);
    }
}
