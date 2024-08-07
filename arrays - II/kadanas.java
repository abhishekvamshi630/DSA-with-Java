import java.util.*;
public class kadanas {
    public static void max_SUm(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < number.length; i++){
            currSum += number[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximun sum of sub Array :"+ maxSum);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        max_SUm(number);
    }
}
