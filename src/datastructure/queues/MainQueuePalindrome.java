package datastructure.queues;

import java.util.LinkedList;

public class MainQueuePalindrome {
    public static void main(String[] args) {
        String test1 = "I did, did I?";
        String test2 = "Racecar";
        String test3 = "hello";


    }

    public static boolean isPalindrome(String string) {
        String lowerCase = string.toLowerCase();
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        //compare the chars stack vs queue push(charc) pop(char)
        for(int i=0; i< lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }
        return true;
    }
}
