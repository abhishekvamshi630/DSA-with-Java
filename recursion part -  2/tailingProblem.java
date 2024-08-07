public class tailingProblem{
    public static int placing_tiles(int n){
        // base Case
        if(n == 0 || n == 1){
            return 1;
        }

        // veritacl arrangement
        // int fnm1 = placing_tiles(n - 1);

        // // Horizontal arrangements
        // int fnm2 =  placing_tiles(n - 2);

        // // calculating total ways
        // int totalWays = fnm1 + fnm2;

        // return totalWays;

        // single line code
        return placing_tiles(n-1) + placing_tiles(n-2);
    }
    public static void main(String[] args) {
        System.out.println(placing_tiles(4));
    }
}