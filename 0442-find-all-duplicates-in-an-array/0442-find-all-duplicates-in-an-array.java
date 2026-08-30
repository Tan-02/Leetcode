import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            int targetIdx = val - 1;
            
            if (nums[targetIdx] < 0) {
                
                result.add(val);
            } else {
                
                nums[targetIdx] = -nums[targetIdx];
            }
        }
        
        return result;
    }
}