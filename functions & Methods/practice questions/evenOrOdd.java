import java.util.*;
public class evenOrOdd {
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = sc.nextInt();

        if(isEven(num)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

    }
}
