import java.util.*;
public class largestNumber {
    public static int largestNumberSearch(int number[]){
        int maxNum = Integer.MIN_VALUE;
        for(int i=0; i < number.length; i++){
            if(maxNum < number[i]){
                maxNum = number[i];
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 8, 6, 7, 5};
        System.out.println("Largest number is :"+ largestNumberSearch(number));
        

    }
}
