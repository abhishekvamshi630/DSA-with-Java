public class diamondPattern {
    public static void diamond_pattern( int n){
        
        // outer loop
        for(int i = 1; i <= n; i++){
            // print Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("D");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i --){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond_pattern(4);
    }
}
