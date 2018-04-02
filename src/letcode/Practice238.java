package letcode;

import java.util.ArrayList;
import java.util.List;

/***
 * 给定n个整数的数组，其中n> 1，nums返回一个数组输出，使得输出[i]等于除nums [i]之外的所有num的元素的乘积。

 在O(n)中

 例如，给出[1,2,3,4]，返回[24,12,8,6]。
 */
public class Practice238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {1,0};
        int[] nums = {1,2,3,4};
        Practice238 practice238 = new Practice238();
        practice238.productExceptSelf(nums);
    }
}
