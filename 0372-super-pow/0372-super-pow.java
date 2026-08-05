class Solution {
    public int superPow(int a, int[] b) {
        int result = 1;
        a %= 1337;

        for (int i = 0; i < b.length; i++) {
            result = (pow(result, 10) * pow(a, b[i])) % 1337;
        }

        return result;
    }

    private int pow(int a, int b) {
        int result = 1;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % 1337;
            }

            a = (a * a) % 1337;
            b /= 2;
        }

        return result;
    }
}