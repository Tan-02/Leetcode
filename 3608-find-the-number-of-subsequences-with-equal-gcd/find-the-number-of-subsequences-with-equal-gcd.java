class Solution {
    static final int MOD = 1000000007;
    int[][][] dp;
    int[] nums;

    public int subsequencePairCount(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        dp = new int[n + 1][201][201];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 200; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(0, 0, 0);
    }
    private int solve(int idx, int gcd1, int gcd2) {
        if (idx == nums.length) {
            if (gcd1 == gcd2 && gcd1 != 0)
                return 1;
            return 0;
        }

        if (dp[idx][gcd1][gcd2] != -1)
            return dp[idx][gcd1][gcd2];
        long ans = 0;
        ans += solve(idx + 1, gcd1, gcd2);
        ans += solve(idx + 1,
                gcd1 == 0 ? nums[idx] : gcd(gcd1, nums[idx]),
                gcd2);
        ans += solve(idx + 1,
                gcd1,
                gcd2 == 0 ? nums[idx] : gcd(gcd2, nums[idx]));
        ans %= MOD;
        return dp[idx][gcd1][gcd2] = (int) ans;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}