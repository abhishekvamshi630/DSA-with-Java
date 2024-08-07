import java.util.*;;
public class pairSumOptimizedSol {
    public static boolean pairSum(ArrayList<Integer> list , int targert){
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp){
            if(list.get(lp) + list.get(rp) == targert){
                return true;
            }

            if(list.get(lp) + list.get(rp) < targert){
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 70;

        System.out.println(pairSum(list, target));
    }
}
