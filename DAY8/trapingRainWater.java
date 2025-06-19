
public class trapingRainWater {

    public static int Trappingwater(int height[]) {
        int n = height.length;
        // calculate left max boundary - array form , (helper Array)
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary -array
        int rightmax[] = new int[n];
        rightmax[n -1]= height [ n -1];
        for (int i=n-2; i>=0 ; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int  trappedeWater = 0;
        // loop
            for(int i=0; i<n;i++){
                // water lavele = min (leftmax , rightmax)
                int waterLevel = Math.min( leftMax[i],rightmax[i]);
                    // trapped water = water level - height[i]
                    trappedeWater += waterLevel - height[i] ;
                
                
                }
                return  trappedeWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(Trappingwater(height));

    }
}


// 11