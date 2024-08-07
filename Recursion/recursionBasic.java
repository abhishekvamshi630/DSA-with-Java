import javax.swing.plaf.synth.SynthStyleFactory;

public class recursionBasic{
    public static void PrintDec(int n ){
        if(n == 1){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        PrintDec(n - 1);
    }

    // Incresing order
    public static void PrintInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
         PrintInc(n - 1);
         System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        PrintInc(n);
    }
}