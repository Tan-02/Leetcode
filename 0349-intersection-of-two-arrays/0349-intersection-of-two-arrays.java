import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        Set<Integer> resultSet = new HashSet<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                resultSet.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[resultSet.size()];
        int idx = 0;
        for (int num : resultSet) {
            result[idx++] = num;
        }

        return result;
    }
}