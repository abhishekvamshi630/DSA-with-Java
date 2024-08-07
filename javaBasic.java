import java.util.*;
public class javaBasic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = sc.nextInt();
        if( a % 2 == 0 ){
            System.out.println("Given number is an Even Number ");
        }else{
            System.out.println("Given number is an Odd Number!");
        }
    }
}