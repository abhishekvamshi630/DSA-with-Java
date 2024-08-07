public class gridWays {
    public static int countWays(int i, int j, int n, int m){
        // base Case
        if(i == n-1 && j == m-1){ // condition for last cell
            return 1;
        }else if(i == n || j == n){ // boundary cross condition 
            return 0;
        }

        // recursion
        int w1 = countWays(i+1, j, n, m); // down 
        int w2 = countWays(i, j+1, n, m); // right

        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countWays(0, 0, n, m));
    }
}
