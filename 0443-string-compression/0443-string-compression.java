class Solution {
    public int compress(char[] chars) {
        int index = 0; // position to write
        int i = 0;     // position to read

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            // Write the character
            chars[index++] = current;

            // Write the count if greater than 1
            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}