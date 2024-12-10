package PRACTICE_BASIC;
import java.util.Scanner;

public class CHECK_PRIME_NUM {
        static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
//      for ( ; i <= num / 2; i++) {
        for (int i=1;i<=500;i++){
            if (isPrime(i)!=0)
            System.out.println(isPrime(i)+" ");
        }
    }
    public static int isPrime(int comingN){
        for ( int i=2; i <= comingN -1 ;i++) {
            if (comingN % i == 0) {
                return 0;
            }
    }
        return comingN;
}
}
