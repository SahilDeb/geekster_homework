
public class TrappingRainWater {

	public static int trap(int[] height) {
        
        if (height.length <= 1) {
            return 0;
        }
        int lMax[] = new int[height.length];
        int rMax[] = new int[height.length];
        
        lMax[0] = height[0];
        rMax[height.length-1] = height[height.length-1];
        for (int i = 1; i < height.length; i++) {
            lMax[i] = Math.max(lMax[i-1], height[i]);
        }
        
        for (int i = height.length-2; i > 0; i--) {
            rMax[i] = Math.max(rMax[i+1], height[i]);
        }
        
        int waterTrapped = 0;
        for (int i = 0; i < height.length; i++) {
            int minWalls = Math.min(lMax[i], rMax[i]);
            
            if (minWalls > height[i]) {
                waterTrapped += minWalls - height[i];
            }
        }
        
        return waterTrapped;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(arr));
	}

}
