public class invertedHalfPyramid {
    public static void half_Pyramid(int n){
        // outer loop
        for(int i = 1; i <= n; i++){
            // print Spaces 
            for(int j = 1; j <= n - i ; j++){
                System.out.print(" ");
                
            }
            // print Stars

            for(int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //inverd half Pyramid numbers

    public static void inverd_half_Pyramid_numbers( int n){
        // outer loop

        for ( int i = 1; i <=n ; i++){
            // Inner Loop
            for(int j =1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverd_half_Pyramid_numbers(4);
    }
}
