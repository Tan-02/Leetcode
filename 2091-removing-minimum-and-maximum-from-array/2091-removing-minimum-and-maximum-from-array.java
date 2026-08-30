class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int minIdx = 0;
        int maxIdx = 0;

        // Find indices of min and max elements
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }

        int first = Math.min(minIdx, maxIdx);
        int second = Math.max(minIdx, maxIdx);

        // Option 1: Remove both from left
        int option1 = second + 1;

        // Option 2: Remove both from right
        int option2 = n - first;

        // Option 3: Remove left element from left, right element from right
        int option3 = (first + 1) + (n - second);

        return Math.min(option1, Math.min(option2, option3));
    }
}
