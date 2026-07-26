class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0;
        while(x<31){
            double sq= Math.pow(2,x);
            if(n==sq){
                return true;
            }
            x++;
        }
        return false;
    }
}