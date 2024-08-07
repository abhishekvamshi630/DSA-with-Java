import java.util.*;
public class largestNum {
    public static void main(String args[]){
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        num1 = sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        num2 = sc.nextInt();
        System.out.println("Enter the 3rd Number :");
        num3 = sc.nextInt();

        if( (num1 > num2) && (num1 > num3) ){
            System.out.println("Number 1 is Greater");
        }
        else if((num2 > num3)){
            System.out.println("Number 2 is Greater");
        }else if(num3 > num2){
            System.out.println("Number 3 is Greater");
        }else{
            System.out.println("Numbers are Equal");
        }
    }
}
