class Solution {
    public String smallestPalindrome(String s) {

        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        String mid = "";

        for (int i = 0; i < 26; i++) {

            while (count[i] >= 2) {
                left.append((char) ('a' + i));
                count[i] -= 2;
            }

            if (count[i] == 1) {
                mid = String.valueOf((char) ('a' + i));
            }
        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + mid + right;
    }
}