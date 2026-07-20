class Solution {
    public String toLowerCase(String s) {
        String ans="";
    for (int i = 0; i < s.length(); i++) {
        ans+= Character.toLowerCase(s.charAt(i));
    }
    return ans;       
    }
}