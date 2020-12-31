package arrays.spiraltraverse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6, 10},
                {10, 9, 8, 7}};

        System.out.println(spiralTraverse(array));
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        int firstPointer = 0;
        int secondPointer = array[0].length - 1;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            list.add(array[firstPointer][i]);
        }

        for(int k = secondPointer; secondPointer > 0; secondPointer--) {

        }

        return new ArrayList<>();
    }
}
