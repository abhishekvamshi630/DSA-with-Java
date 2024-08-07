public class binarySearch {
    public static int binary_search(int number[], int key){
        int start = 0, end = number.length -1;
        

        // comparions

        while(start <= end){
            int mid = (start + end) / 2;
            // comparision

            if(number[mid]== key){
                return mid;
            }
            else if(number[mid] < key){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 2;

        int index = binary_search(number, key);

        if(index == -1){
            System.out.println("Value not Found");
        }else{
            System.out.println("Key Found at index :"+ index);
    }
        }

        
}
