class Solution {
    public int missingNumber(int[] arr) {
        int min = 0;
        int max = arr.length;

        // for (int i = 0; i < arr.length; i++) {
        //     min = Math.min(min, arr[i]);
        //     // max = Math.max(max, arr[i]);
        // }

        for (int j = min; j <= max; j++) {

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (j == arr[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return j;
            }
        }

        return -1;
    }
}