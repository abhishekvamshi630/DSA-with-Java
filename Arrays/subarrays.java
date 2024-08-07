public class subarrays {
    public static void printSubArray(int arr[]){
        int tp = 0;
        int sumArr = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k]+" ");
                    // finding the maximum number
                    for(int z = 0; z < arr.length; z++){
                        if(max < arr[z]){
                            max = arr[z];
                        }
                    }
                    // calculating Sum of all Sub Arrays
                    for(int s = start; s <= end; s++){
                        sumArr = sumArr + s;
                    }
                    
                }
                
                tp++;
                
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("Total pairs : "+ tp);
        System.out.println("Sum of Sub Arrays : "+ sumArr);
        System.out.println("Max value : "+ max);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubArray(arr);
        
    }
}
