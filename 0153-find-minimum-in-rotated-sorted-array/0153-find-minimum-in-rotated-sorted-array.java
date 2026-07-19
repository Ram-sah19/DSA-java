class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++){
            min = Math.min(min, nums[i]);
            // for(int j =nums.length-1; j>=0;j--){
                
            // }
        }
        return min;
    }
}