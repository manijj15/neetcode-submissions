class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long maxSum = Long.MIN_VALUE;
        int start = 0, end = 0;
        long currentSum = 0;

        for ( ; end < nums.length; end++) {
            currentSum += nums[end];
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end], 0) + 1);

            if (end - start + 1 == k) {
                if (freqMap.size() == k) {
                    maxSum = Math.max(currentSum, maxSum);
                }

                freqMap.put(nums[start], freqMap.get(nums[start]) - 1);
                if (freqMap.get(nums[start]) == 0) {
                    freqMap.remove(nums[start]);
                }

                currentSum -= nums[start];
                start++;
            }
        }

        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
 
    }
}
