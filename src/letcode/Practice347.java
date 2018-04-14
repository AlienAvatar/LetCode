package letcode;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 * <p>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class Practice347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null) {
            return null;
        }

        int max = 0;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer it = (Integer) iterator.next();
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == it) {
                    count++;
                    if (count > max) {
                        max = count;
                        list.add(nums[i]);
                    }
                }
            }
        }
        System.out.println(max);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        Practice347 practice347 = new Practice347();
        practice347.topKFrequent(nums, 2);
    }
}
