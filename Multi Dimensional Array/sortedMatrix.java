public class sortedMatrix {
    public static boolean sorted_matrix(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        // condition check
        while ((row < matrix.length && col >= 0)) {
            if(matrix[row][col] == key){
                System.out.println("Element found at index ("+row+ ","+ col+ ")");
                return true;
            }
            else if(key < matrix[row][col]){
                // move left
                col--;
            }else{
                // move bottom
                row++;
            }
            
        }
        System.out.println("Element not found!...");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};
        System.out.println(sorted_matrix(matrix, 200));
    }
}
