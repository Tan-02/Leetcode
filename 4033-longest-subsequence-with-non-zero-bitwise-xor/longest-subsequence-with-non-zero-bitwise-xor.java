class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int n = nums.length;
        boolean nonZero = false;

        for (int x : nums) {
            xor ^= x;
            if (x != 0) {
                nonZero = true;
            }
        }

        if (xor != 0) {
            return n;
        }

        if (nonZero) {
            return n - 1;
        }

        return 0;
    }
}