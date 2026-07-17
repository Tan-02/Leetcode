class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String s : sentences) {
            int words = 1;
            for (char c : s.toCharArray()) {
                if (c == ' ')
                    words++;
            }
            ans = Math.max(ans, words);
        }
        return ans;
    }
}