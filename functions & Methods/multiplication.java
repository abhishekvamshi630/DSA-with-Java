import java.util.*;
public class multiplication {
    public static int product(int a, int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul =product(a, b);
        System.out.println(mul);
    }
}
