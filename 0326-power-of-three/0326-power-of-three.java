class Solution {
    public boolean isPowerOfThree(int n) {
        int x=0;
        while(x<31){
            double sq= Math.pow(3,x);
            if(n==sq){
                return true;
            }
            x++;
        }
        return false;
    }
}