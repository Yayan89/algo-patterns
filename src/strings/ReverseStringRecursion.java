package strings;

public class ReverseStringRecursion {
    private static String test = "I am in love with chocolate!";

    public static void main(String[] args) {
        System.out.println(reverse(test));
    }

    private static String reverse(String str) {
        if(str.length() == 1 ) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
