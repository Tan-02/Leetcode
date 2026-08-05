class Solution {
    public int mirrorDistance(int n) {
        int cp =n;
        int rev=0;
        int ans=0;
        while(n>0){
            int digit=n%10;
            rev = rev * 10 + digit;
            n/=10;
        }
        ans=Math.abs(cp-rev);
        return ans;

    }
}