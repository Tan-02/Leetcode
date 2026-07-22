class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int[] value = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };
        String[] roman = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };
         int i = 0;

        while (i < s.length()) {

            for (int j = 0; j < roman.length; j++) {

                if (s.startsWith(roman[j], i)) {
                    ans += value[j];
                    i += roman[j].length();
                    break;
                }
            }
        }

        return ans;
    
    }

}
