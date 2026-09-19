class Solution {
    public int repeatedNTimes(int[] nums) {
        int count =0;
        for(int i =0; i<nums.length;i++){
            for(int j = nums.length-1; j>=0;j--){
                if(i!=j && nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}