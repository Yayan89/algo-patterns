package ValidateSubsequence;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);

        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        //Time O(N)
        //Space O(1)
        int index = 0;
        int size = sequence.size();
        for (int i : array) {
            if (i == sequence.get(index)) {
                index++;
                size--;
                if (size == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {
        //Time O(N)
        //Space O(1)
        int index = 0;
        for (int value : array) {
            if (index == sequence.size()) {
                break;
            }
            if (sequence.get(index) == value) {
                index++;
            }
        }
        return index == sequence.size();
    }

    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        //Time O(N)
        //Space O(1)
        int arrIndex = 0;
        int seqIndex = 0;
        while (arrIndex < array.size() && seqIndex < sequence.size()) {
            if (array.get((arrIndex)).equals(sequence.get(seqIndex))) {
                seqIndex++;
            }
            arrIndex++;
        }
        return seqIndex == sequence.size();
    }
}