public class checkPowerOfTwo {
    public static boolean powerOfTwo(int n){
        return (n &(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerOfTwo(3));
    }
}