package fibonacci;

public class fibonacci {
    //up to 100
    //011235813 ... 100
    //use recursion
    public static void main(String[] args) {
        for(int i=0; i<12; i ++) {
            System.out.print(calculate(i));
        }
    }

    //i = 10
    static int calculate(int i) {
        if(i == 1) {
            return 1;
        }

        if(i <= 0 )
            return 0;

        return calculate(i - 1) + calculate(i - 2);
    }

    // i=2 -> 0+(0)
}
