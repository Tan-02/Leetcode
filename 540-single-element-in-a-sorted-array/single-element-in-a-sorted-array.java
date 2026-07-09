import java.util.*;
import java.util.HashMap;

class Solution{
    public int singleNonDuplicate(int[] nums) {
    HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num:nums){
        if(map.get(num)==1){
            return num;
    } 
    }
    return -1;
        }
        }
 