import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to Check Factorial :");
        n =sc.nextInt();
        int i = 1;
        while(i<=n){
            fact = fact * i;
            System.out.println(fact);
            i++;
        }
    }
}
