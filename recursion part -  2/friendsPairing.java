public class friendsPairing {
    public static int pair_friends(int n){
        // base case
        if(n == 1 || n == 2){
            return n;
        }
        // single pair
        int fnm1 = pair_friends(n-1);

        // pair
        int fnm2 = pair_friends(n-2);
        int pairWays = (n-1) * fnm2;

        // total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(pair_friends(3));
    }
}
