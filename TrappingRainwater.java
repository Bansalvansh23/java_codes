// In this problem we mainly use the formula {{TrappedWater = (waterLevel - HeightOfBar)}}
// Where waterLevel is calculated using {{ Min(maxLeftBoundary , maxRightBoundary)}}
// To calculate this left and right boundary we use ""Auxilary arrays(also knows as helper arrays)""

public class TrappingRainwater {
    public static void main(String args[]) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappedWater(height));
    }

    public static int TrappedWater(int height[]) {
        int n = height.length;
        // Calculate left max boundary
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // Calculate right max boundary
        int[] rightmax = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trapwater = 0;
        // Loop
        for (int i = 0; i < n; i++) {
            // WaterLevel = min(leftMaxBound , rightMaxBound)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trapWater = WaterLevel - height[i]
            trapwater += waterlevel - height[i];
        }
        return trapwater;
    }
}
