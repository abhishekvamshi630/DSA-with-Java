public class NthFibonacci {
    public static int FindNthFib(int n){
        // calculating Base case
        if(n == 0 || n == 1){
            return n;
        }
        //calsulating f(n-1) and f(n-2) and store in a variable
        int fnm1 = FindNthFib(n - 1);// fnm1 -> n - 1;
        int fnm2 = FindNthFib(n - 2);// fnm2 -> n - 2;
        // Calculating Fibanacci Number
        int fib = fnm1 + fnm2;
        return fib;
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println(FindNthFib(n));
    }
}
