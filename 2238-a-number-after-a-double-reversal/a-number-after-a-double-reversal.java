class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
        int rev1=0;
        int rev2=0;
      while(num>0){
        int rem=num%10;
        rev1= rev1 *10 + rem;
        num=num/10;
      }
      while(rev1>0){
        int rem=rev1%10;
        rev2=rev2*10+rem;
        rev1=rev1/10; 
    }
    return original==rev2;
    }
}