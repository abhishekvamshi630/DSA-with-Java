import java.util.ArrayList;

public class optimizedSol {
    public static int tarppedWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0; // left pointer
        int rp = height.size()-1; // right pointer

        while ((lp < rp)) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp - lp;
            int currWater = ht * wd;
            maxWater = Math.max(maxWater, currWater);

            // updation
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(3);
        height.add(8);
        height.add(7);

        System.out.println(tarppedWater(height));
    }
}
