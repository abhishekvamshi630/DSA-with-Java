import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int num){
        int palindrome = num;
        int revNum = 0;
        
        while(palindrome != 0){
            int lastDigit = palindrome % 10;
            revNum = (revNum * 10) + lastDigit;
            palindrome = palindrome /10;
        }

             if( revNum == num){
                return true;
             }
            else{
                 return false;
             }
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");

        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}
