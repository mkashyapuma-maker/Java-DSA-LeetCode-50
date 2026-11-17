import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (indexByValue.containsKey(needed))
                return new int[]{indexByValue.get(needed), i};
            indexByValue.put(nums[i], i);
        }
        return new int[0];
    }
}
