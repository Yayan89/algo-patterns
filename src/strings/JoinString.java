package strings;

public class JoinString {
    public static void main(String[] args) {
        String[] stringArray = { "My ", "life ", "for ", "Auir" , "!"};
        System.out.println(joinWords(stringArray));
    }

    public static String joinWords(String[] words) {
        String result = "";

        for(String s : words) {
            result = result + s;
        }
        return result;
    }
}
