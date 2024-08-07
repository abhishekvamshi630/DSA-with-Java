public class trappingRainWater {
    public static int trapped_water(int rainWater[]){
        int n = rainWater.length;
        // calculating leftMax - array
        int leftMax[] = new int[rainWater.length];
        leftMax[0] = rainWater[0];

        for(int i = 1; i < n; i++ ){
            leftMax[i] = Math.max(leftMax[i - 1], rainWater[i]);
        }
        // calculating rightmax - array

        int rightmax[] = new int[n];
        rightmax[ n - 1] = rainWater[ n- 1];
        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(rainWater[i], rightmax[i + 1]);
        }

        int trappedWater = 0;

        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(rightmax[i], leftMax[i]);

            trappedWater += waterLevel - rainWater[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int rainWater[] = {1, 0, 2, 1, 0, 3, 2, 1, 2};
        System.out.println(trapped_water(rainWater));
    }
}
