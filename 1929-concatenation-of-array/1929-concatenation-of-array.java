class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] merged = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums))
                                .toArray();
                                
        return merged; 
    }
}