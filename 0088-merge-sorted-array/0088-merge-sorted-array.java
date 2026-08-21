class Solution {
    public void merge(int[] first, int m, int[] second, int n) {
        int p1 = m-1, p2=n-1, i = m+n-1;
        while(p2 >= 0){
            if(p1 >= 0  && first[p1]> second[p2]){
                first[i--] = first[p1--];
            }
            else{
                first[i--] =  second[p2--];
            }
        }
    }
}