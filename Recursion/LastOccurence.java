public class LastOccurence {
    public static int Search(int arr[], int key, int i){
        // checking Base case
        if(i == arr.length){
            
            return -1;
        }

        int isFound = Search(arr, key, i+1);
        
        if(isFound == -1 && arr[i] == key){
        
            return i;
            
        }
        
    return isFound;

        
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 1, 7, 9, 10, 9};
        int key = 9;
        System.out.println(Search(arr, key, 0));
    }
}

