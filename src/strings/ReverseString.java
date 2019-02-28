package strings;

import java.util.Arrays;

public class ReverseString {
    private static String test = "I am in love with chocolate!";

    public static void main(String[] args) {
        char[] chars = test.toCharArray();
        char[] result = new char[chars.length];

        //length of string is 1 more of array
        int counter = test.length() - 1;
        for (int k = 0; k < result.length; k++) {
            result[k] = chars[counter--];
        }
        System.out.println(Arrays.toString(result));
    }
}