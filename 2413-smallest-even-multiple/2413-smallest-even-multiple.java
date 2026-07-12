class Solution {
    public int smallestEvenMultiple(int n) {
        int num =2;
        if(n%2!=0){
            int smallest_nrb = n * num;
            return smallest_nrb ; 
        }else{
            n = n/2;
            n = num*n;
            return n ;
        }
        // return -1;
    }
}