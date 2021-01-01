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

        array = new int[][] {{1}};
        System.out.println(spiralTraverse(array));

        array = new int[][] {{1, 3, 2, 5, 4, 7, 6}};
        System.out.println(spiralTraverse(array));

        array = new int[][] {{1}, {3}, {2}, {5}, {4}, {7}, {6}};
        System.out.println(spiralTraverse(array));

        array = new int[][] {
                {4, 2, 3, 6, 7, 8, 1, 9, 5, 10},
                {12, 19, 15, 16, 20, 18, 13, 17, 11, 14}};
        System.out.println(spiralTraverse(array));
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        int startingColumn = 0;
        int endingColumn = array[0].length - 1;
        int startingRow = 0;
        int endingRow = array.length - 1;

        List<Integer> list = new ArrayList<>();

        while (startingRow <= endingRow && startingColumn <= endingColumn) {

            for (int column = startingColumn; column <= endingColumn; column++) {
                list.add(array[startingRow][column]);
            }

            for (int row = startingRow + 1; row <= endingRow; row++) {
                list.add(array[row][endingColumn]);
            }

            for (int column = endingColumn - 1; column >= startingColumn; column--) {
                if (startingColumn == endingRow) break;
                list.add(array[endingRow][column]);
            }

            for (int row = endingRow - 1; row > startingRow; row--) {
                if (startingColumn == endingColumn) break;
                list.add(array[row][startingColumn]);
            }
            endingRow--;
            endingColumn--;
            startingColumn++;
            startingRow++;
        }
        return list;
    }
}
