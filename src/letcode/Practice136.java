package letcode;

import java.util.*;

/**
 * 给定一个整数数组，除了某个元素外其余元素均出现两次。请找出这个只出现一次的元素。
 */
public class Practice136 {
    public int singleNumber(int[] nums) {
        if(nums == null){
            return 0;
        }
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            boolean b = set.add(i);
            if(!b){
                set.remove(i);
            }
        }
        Iterator<Integer> it = set.iterator();
        count = it.next();

        return count;
    }

    public int singleNumber2(int[] nums){
        int result  = 0;
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = {1,1,2,3,2};
        int b[] = {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
        Practice136 practice136 = new Practice136();
        System.out.println(practice136.singleNumber2(b));
    }
}
