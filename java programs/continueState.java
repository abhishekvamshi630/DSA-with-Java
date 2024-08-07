import java.util.Scanner;
public class continueState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a Number :");
            int n = sc.nextInt();
            if ( n %10 == 0) {
                continue;
            }
            System.out.println("your number was : " +  n);
        }while(true);
        
    }
}
