class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0;
        for( int n : cardPoints) {
            total += n;
        }

        int max = 0;
        int currentSum = 0;
        int start = 0;
        int remainingLength = cardPoints.length - k;
        if(remainingLength == 0) {
            return total;
        }
        for (int end = 0; end < cardPoints.length; end++) {
            currentSum += cardPoints[end];

            if (end - start + 1 == remainingLength) {
                
                max = Math.max(max, total - currentSum);
                currentSum -= cardPoints[start];
                start++;
            }
        }
        return max;
    }
}