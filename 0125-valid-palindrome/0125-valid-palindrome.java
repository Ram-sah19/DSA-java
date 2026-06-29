class Solution {
    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        
        }
        return true;
    }
}