public class factorial {
    public static int  factorial(int n){
        int fact = 1;
        int i =1;
        while(i<=n){
            fact *= i;
            System.out.println(fact);
            i++;
        }
        return fact;
        
    }
    public static void main(String[] args) {
        factorial(5);
    }
}
