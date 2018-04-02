package letcode;

import java.util.*;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

 找到所有在 [1, n] 范围之间没有出现在数组中的数字。

 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

 示例:

 输入:
 [4,3,2,7,8,2,3,1]

 输出:
 [5,6]
 */
public class Practice448 {
    //Time Limit Exceeded
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null){
            return null;
        }
        List list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        List list2 = new ArrayList<Integer>();
        for(int i = 1; i <= list.size(); i++){
            if(!list.contains(i)){
               list2.add(i);
            }
        }
        return list2;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) -1 ;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length;i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
//        int[] nums = {1,1};
        Practice448 practice448 = new Practice448();
        practice448.findDisappearedNumbers2(nums);
    }
}
