public class triangle {
    public static void triangle_zeroOnes(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                int even = i+j;
                if( even % 2 == 0 ){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle_zeroOnes(4);
    }
}
