public class binaryToDec {
    public static void binaryToDecimal(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;

            dec = dec + ( lastDigit * (int)Math.pow(2, pow));

            pow ++;
            binNum = binNum/10;
        }
        System.out.println("The decimal of "+ myNum + " = "+ dec);
    }

    public static void main (String args[]){
        binaryToDecimal(111);
    }
}
