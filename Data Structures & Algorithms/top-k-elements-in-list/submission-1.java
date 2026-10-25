class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        
        for (int i  = 0; i < nums.length; i++) {
            countMap.put( nums[i], countMap.getOrDefault(nums[i], 0) + 1 );
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int j = 0;
        int[] result = new int[k];
        for (int i = freq.length - 1; i > 0 && j <= k; i--) {
            for (int n: freq[i]){
                result[j++] = n;
                if (j == k)
                    return result;
            }
        }

        return result;
    }
}
