public class FactorialNum {
    public static int FactOfNum(int n){
        // checking for 0 factorial
        if(n == 0){
            return 1;
        }
        // Assuming factorial as f(n-1)
        int fnm1 = FactOfNum(n - 1);
        // Calculating Factorial
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println("factorial of "+ n + ":"+FactOfNum(n));
    }
}
