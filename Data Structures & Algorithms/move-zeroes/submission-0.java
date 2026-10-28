class Solution {
    public void moveZeroes(int[] nums) {
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
    }
}