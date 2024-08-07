public class oddOrEven{
    public static void odd_Even(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");

        }
    }
    public static void main(String[] args) {
        odd_Even(89);
        odd_Even(72);
        
    }
}