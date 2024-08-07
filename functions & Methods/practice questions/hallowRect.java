public class hallowRect {
    public static void hallow_Rectangle(int totalRows, int totalColms ){
        
        //outer loop
        for(int i=1; i <= totalRows; i++){
            // Innerloop
            for(int j = 1; j<= totalColms; j++){

                // (i , j)
                if(i ==1 || i == totalRows || j == 1 || j == totalColms){
                    System.out.print( "*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hallow_Rectangle(10, 5);
    }
}
