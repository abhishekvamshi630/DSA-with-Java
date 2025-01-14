public class tapedRainWater {
    public static int tapping_rain_water(int height[]){
        int n = height.length;
        // calculate max left - Array
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for(int i = 1; i < n; i++){
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }
        // cclculate max height - Array

        int maxRight[] = new int[n];
        maxRight[n-1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            maxRight[i] = Math.max(height[i], maxRight[ i + 1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i < n; i++){
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            // calculate trapped rain water
            trappedWater += waterLevel - height[i];
        }
        
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(tapping_rain_water(height));
    }
}
