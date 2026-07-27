class Solution {
    public boolean isPowerOfFour(int n) {
                int x=0;
        while(x<31){
            double sq= Math.pow(4,x);
            if(n==sq){
                return true;
            }
            x++;
        }
        return false;
    }
}