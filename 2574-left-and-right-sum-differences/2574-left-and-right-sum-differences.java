class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int total =0;
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
        total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            total -= nums[i];
            ans[i] = Math.abs(leftSum - total);
            leftSum += nums[i];
            }
            return ans;
            }
        }

