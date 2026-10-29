class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        int total = 0;

        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                if (height[l] >= leftMax) {
                    leftMax = height[l];
                } else {
                    total += (leftMax - height[l]);
                }
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                total += rightMax - height[r];
            }
        }
        
        return total;
    }
}
