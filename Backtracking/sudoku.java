public class sudoku {
    public static boolean isSafe(int sudoku[][], int row,int col,int digit){
        // checking column wise
        for(int i = 0; i < 9; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        // checking row wise
        for(int j = 0; j < 9; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        // checking grid wise

        // for checking the grid 1st we have to findout starting row & starting column of the grid 
        int sr = (row/3)*3; // it will give the starting row
        int sc = (col/3)*3; // it will give the starting column of the grid

        for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row == 9){
            return true;
        }

        // this condition is used to check all the columns in a row and then moving to next row
        int nextrow = row, nextcol = col + 1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }

        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextrow, nextcol);
        }
        // recursion
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextrow, nextcol)){ // checking for olution exits or not
                    return true;
                }

                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution Exists!....");
            printSudoku(sudoku);
        }else{
            System.out.println("Solution does not Exists!...");
        }
    }
}
