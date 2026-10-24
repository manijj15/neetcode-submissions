class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i : nums) {
            if (duplicate.add(i) == false) {
                return true;
            }
        }
        return false;
    }
}