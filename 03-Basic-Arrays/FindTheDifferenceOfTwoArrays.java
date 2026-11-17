import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> first = new HashSet<>(), second = new HashSet<>();
        for (int n : nums1) first.add(n);
        for (int n : nums2) second.add(n);
        List<Integer> onlyFirst = new ArrayList<>(), onlySecond = new ArrayList<>();
        for (int n : first) if (!second.contains(n)) onlyFirst.add(n);
        for (int n : second) if (!first.contains(n)) onlySecond.add(n);
        return Arrays.asList(onlyFirst, onlySecond);
    }
}
