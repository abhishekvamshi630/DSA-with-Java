public class maxSubArraySum{
    public static void max_subArray_Sum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < number.length; i++){
            int first = i;
            for(int j = i; j < number.length; j++){
                int end = j;
                currSum = 0;
                for(int k = first; k <= end; k++){
                    currSum += number[k];
                    System.out.print(currSum+" ");
                }
                
                System.out.println();

                if(maxSum < currSum){
                    maxSum = currSum;
                    
                }
            }
            System.out.println("maximun sum of sub array is : "+ maxSum);
        }
        System.out.println();
        
            
    }

    public static void main(String[] args) {
        int  number[] = {2, 4, 6, 8, 10};
        
        max_subArray_Sum(number);

    }
}