public class optimizedPower {
    public static int OptiPow(int x, int n){
        // chek base case
        if(n == 0){
            return 1;
        }
        // even 
        int halfPow = OptiPow(x, n/2);
        int halfPowSq = halfPow * halfPow;
        //Odd
        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;

    }
    public static void main(String[] args) {
        System.out.println(OptiPow(2, 10));
    }
}
