
import java.util.*;
public class prime {
    public static boolean checkPrime(int n){
        boolean isPrime = true;
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void primeInRange(int n){
        int sum = 0;
        for(int i=2; i<=n; i++){
            if (isPrime(i)) {
                sum += i;
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        primeInRange(20);
    }
}
