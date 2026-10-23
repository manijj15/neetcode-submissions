class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int num = i;
            result[i] = 0;
            while(num != 0 ) {
                if((num & 1) == 1) {
                    result[i]++;
                }
                num = num >> 1;
            }
        }
        return result;
    }
}
