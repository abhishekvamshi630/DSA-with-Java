public class CalPower {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int xnm1 = power(x, n-1);
        int cp = x * xnm1;

        return cp;
    };
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
