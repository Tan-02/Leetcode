import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] copy = Arrays.copyOf(arr, arr.length);
         Arrays.sort(copy);
        int rank=1;
        for( int num:copy){
            if(!map.containsKey(num)) {
            map.put(num, rank);
            rank++;
    }
}
for(int i = 0; i < arr.length; i++) {
    arr[i] = map.get(arr[i]);
}
return arr;
    }
        }