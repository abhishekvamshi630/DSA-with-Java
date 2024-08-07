public class nQueens {
    public static boolean isSafe(char board[][], int row, int col){
        // vertical UP
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // left up diagonal
        for(int i = row-1, j = col-1; i>=0 && j >= 0; i--,j-- ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // right up diagonal
        for(int i = row-1, j = col+1; i >=0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void n_Queens(char board[][], int row){
        // base case
        if(row == board.length){
            printQ(board);
            return;
        }

        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                n_Queens(board, row+1);// Function Call
                board[row][j] = 'X'; // Backtracking
            }
            
        }
    }
    public static void printQ(char board[][]){
        System.out.println("---------N-Queens---------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // for initial initialization of Queens
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = 'X';
            }
        }

        n_Queens(board, 0);

    }
}
