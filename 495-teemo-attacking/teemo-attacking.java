class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        for(int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];
            if(gap >= duration) {
                ans += duration;
            } else {
                ans += gap;
            }
        }
        return ans + duration;
    }
}