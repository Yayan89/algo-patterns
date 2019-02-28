package primenumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //2,3,4,5,6....
        for (int k = 2; k < 100; k++) {
            boolean prime = isPrime(k);
            if(prime) System.out.println(k);
        }
    }

    //number -> 2,3,4,5,6,7,7,8,9.....100
    private static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
