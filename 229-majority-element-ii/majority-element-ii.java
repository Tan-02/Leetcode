import java.util.HashMap;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
            for(int key:map.keySet()){
                if(map.get(key)>nums.length/3){
                    ans.add(key);
                }
            }
            return ans;
        }
    }
