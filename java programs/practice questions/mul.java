import java.util.*;
class mul{
    public static void main(String[] args){
        int n;
        int multi = 1;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table Which you want to Print :");
        n = sc.nextInt();

        for(i = 1; i<=10; i++){
            multi = n * i;
            System.out.println(n + "*" + i + "=" + multi);
        }
    }
}