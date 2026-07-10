class Solution {
    public String reverseVowels(String s) {
         String vowels = "";

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(isVowel(ch)) {
                vowels += ch;
            }
        }

        char[] arr = s.toCharArray();
        int j = vowels.length() - 1;

        for(int i = 0; i < arr.length; i++) {

            if(isVowel(arr[i])) {
                arr[i] = vowels.charAt(j);
                j--;
            }
        }

        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}