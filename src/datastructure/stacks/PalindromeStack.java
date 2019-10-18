package datastructure.stacks;

import java.util.LinkedList;

public class PalindromeStack {
    public static void main(String[] args) {
        //use Stack
        //ignore case
        //ignore punctuation
        //use LIFO

        String didI = "I did, did I?";
        String test2 = "Don't nod";
        String test3 = "abccba";
        System.out.println(checkForPalinDrome(didI));
    }

    public static boolean checkForPalinDrome(String string) {
        //transform string in lower-case, remove punctuations
        char[] chars = string.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            if (String.valueOf(aChar).matches("[a-z-A-Z]")) {
                builder.append(aChar);
            }
        }

        //if its odd number length, then divide
        //if its even, just compare from middle
        String subString1;
        String subString2;
        if (builder.length() % 2 == 0) {
            subString1 = builder.substring(0, builder.length() / 2);
            subString2 = builder.reverse().substring(0, builder.length() / 2);

            return subString1.equalsIgnoreCase(subString2);
        } else {
            subString1 = builder.substring(0, builder.length() / 2 + 1);
            subString2 = builder.reverse().substring(0, builder.length() / 2 + 1);

            return subString1.equalsIgnoreCase(subString2);
        }
    }

    public boolean checkingPalinDromeWithLIFO(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder noPunctString = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                noPunctString.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return noPunctString.toString().equals(reversedString.toString());
    }

}
