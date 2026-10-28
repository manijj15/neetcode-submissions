class Solution {
    public void moveZeroes(int[] nums) {
        /* extra space solution

        int[] result = new int[nums.length];
        Arrays.fill(result, 0);

        int i = 0;
        for(int num: nums) {
            if (num != 0) {
                result[i] = num;
                i++;
            }
        }


        for(int j = 0; j < nums.length; j++) {
            nums[j] = result[j];
        }

        */

        int left = 0;
        int i = 0;

        for(; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }
    }
}