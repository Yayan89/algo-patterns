package strings;

public class ReverseStringWithStringBuilder {
    private static String test = "I am in love with the chocolate!";

    public static void main(String[] args) {
        System.out.println(reverse(test));
    }

    private static String reverse(String str) {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
}
