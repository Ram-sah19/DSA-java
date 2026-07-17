class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        long[] exact = new long[max + 1];
        int[] divisible = new int[max + 1];
        for (int g = 1; g <= max; g++) {
            int cnt = 0;
            for (int multiple = g; multiple <= max; multiple += g) {
                cnt += freq[multiple];
            }
            divisible[g] = cnt;
        }
        for (int g = max; g >= 1; g--) {
            long pairs = (long) divisible[g] * (divisible[g] - 1) / 2;

            for (int multiple = g * 2; multiple <= max; multiple += g) {
                pairs -= exact[multiple];
            }

            exact[g] = pairs;
        }
        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + exact[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long q = queries[i];

            int l = 1, r = max;
            while (l < r) {
                int mid = (l + r) >>> 1;
                if (prefix[mid] > q)
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[i] = l;
        }

        return ans;
    }
}