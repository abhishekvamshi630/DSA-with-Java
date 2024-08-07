import java.util.*;
public class sumOfDigits {
    public static void sumOfInteger(int num){
        int sum = 0;

        while(num > 0){
            int lastDigit = num %10;
            sum = sum + lastDigit;
            System.out.println("The sum of Digits = "+ sum);
            num = num / 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");

        int num = sc.nextInt();

        sumOfInteger(num);
    }
}
