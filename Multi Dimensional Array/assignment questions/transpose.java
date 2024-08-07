public class transpose {
    public static void swapping(int matrix[][]){
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        
        int matrix[][] = {{11,12,13},{21,22,23}};
        // originaal matrix
        swapping(matrix);

        int row = matrix.length, col = matrix[0].length;

        //transpose matrix
        int transpose[][] = new int[col][row];

        for(int i = 0; i <row; i ++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        // print transpose matrix
        swapping(transpose);
    }
}
