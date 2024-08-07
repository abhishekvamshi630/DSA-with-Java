import java.util.*;
public class breakState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a Number :");
            int n = sc.nextInt();
            if ( n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("Yo're Task has completed!...");
    }
}
