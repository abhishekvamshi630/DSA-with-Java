public class bitOperations {
    public static int getBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }
    // set Ith Bit

    public static int setBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // clear Ith bit

    public static int clearBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // update ith Bit

    public static int updateBit(int n , int i, int newBit){
        if(newBit == 0){
            return clearBit(n, i);
        }else{
            return setBit(n, i);
        }
    }

    // clear last Bit
    public static int clearLastBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    // clear bits in range

    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<< (j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
