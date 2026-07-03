class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int flag=0;
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target){
                if(flag==0){
                    first=i;
                    flag++;
                }
                last=i;  
            }
        }
        vector<int>v={first,last};
        return v;
    }
};
