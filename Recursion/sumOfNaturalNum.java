public class sumOfNaturalNum {
    public static int SumNatNum(int n){
        if(n == 1){
            return 1;
        }
        // Creating a variable to store f(n-1)
        int fnm1 = SumNatNum(n - 1);
        int sumOfNumbers = n + fnm1;
        return sumOfNumbers;    
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(SumNatNum(n));
    }
}
