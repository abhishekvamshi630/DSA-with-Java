import java.util.*;
public class twoDArray{

    public static boolean search(int matrix[][], int key){
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at (" + i + ","+ j + ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void largestArray(int matrix[][]){
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Largest valuse : "+ max);
       
    }
    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix [i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(search(matrix, 5));
        largestArray(matrix);

    }
}