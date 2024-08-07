import java.util.*;
public class checkPrime {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        num = sc.nextInt();
        
        int sum = 0;

        for(int i=2; i<= num-1; i++){
            if(num % i != 0){
                sum += i;
                System.out.println(sum);
                
            }
        }
        
    }
}


