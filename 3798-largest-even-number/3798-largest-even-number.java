class Solution {
    public String largestEven(String s) {

        while (s.length() > 0) {
            int num = s.charAt(s.length() - 1) - '0';

            if (num % 2 == 0) {
                return s;
            } else {
                s = s.substring(0, s.length() - 1);
            }
        }

        return "";
    }
}