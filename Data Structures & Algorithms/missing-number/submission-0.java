class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int expectedSum = 0;
        int i = 0;

        for (; i < nums.length; i++) {
            actualSum = actualSum + nums[i];
            expectedSum = expectedSum + i;
        }

        expectedSum = expectedSum + i;
        return expectedSum - actualSum;
    }
}
