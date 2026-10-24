class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> arrayMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            arrayMap.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int current = nums[j];
            int remaining = target - current;

            int remainingIndex = arrayMap.getOrDefault(remaining, -1);

            if (remainingIndex != -1 && remainingIndex != j) {
                return new int[] {j, remainingIndex};
            }
        }

        return new int[] {};
        
    }
}
