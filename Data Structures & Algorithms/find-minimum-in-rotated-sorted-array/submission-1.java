class Solution {
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        // when l = r, then we narrowed down the value and can return in
        // so no need for l <= r
        while ( l < r ) {
            int m = l + ( r - l) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return nums[l];
        
    }
}
