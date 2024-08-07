public class searchOfSeven {
    public static int seven_search(int matrix[][]){
        int seven = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    seven++;
                }
            }
        }
        return seven;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                          {8,8,7},
                          {15,7,24}};
        System.out.println(seven_search(matrix));
    }
}
