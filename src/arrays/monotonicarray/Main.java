package arrays.monotonicarray;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.println(isMonotonic(array));

        array = new int[] {1, 5, 10, 1100, -10, 1102, 9001};
        System.out.println(isMonotonic(array));

        array = new int[] {1, 2, 0};
        System.out.println(isMonotonic(array));

        array = new int[] {1, 1, 1, 2};
        System.out.println(isMonotonic(array));
    }

    public static boolean isMonotonic(int[] array) {
        if (array.length <= 2) {
            return true;
        }
        var direction = array[1] - array[0];

        for (int i = 2; i < array.length; i++) {
            if (direction == 0) {
                direction = array[i] - array[i - 1];
                continue;
            }
            if (breaksDirection(direction, array[i - 1], array[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean breaksDirection(int direction, int previous, int current) {
        var difference = current - previous;

        if (direction > 0) {
            return difference < 0;
        }
        return difference > 0;
    }
}
