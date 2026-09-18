class Solution {
    static final long MOD = 1_000_000_007;
    long[] dp;

    public int numTilings(int n) {
        dp = new long[n + 1];
        Arrays.fill(dp, -1);

        return (int) solve(n);
    }

    private long solve(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = (2 * solve(n - 1) + solve(n - 3)) % MOD;

        return dp[n];
    }
}
