class Solution {
    public int[] searchRange(int[] nums, int target) {
        // for(int i =0;i<nums.length;i++){
        //     for(int j =nums.length-1;j>=0;j--){
        //         if(nums[i]==target && nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int []{-1,-1};
         int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        return new int[]{first, last};
    }
}