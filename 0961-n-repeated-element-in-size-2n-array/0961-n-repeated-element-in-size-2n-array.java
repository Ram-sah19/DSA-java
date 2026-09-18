class Solution {
    public int repeatedNTimes(int[] nums) {
        int count =0;
        for(int i =0; i<nums.length;i++){
            for(int j =0; j<i;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return 1;
    }
}