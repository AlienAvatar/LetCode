package letcode;

/**
 *
 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

 你可以假设数组是非空的，并且数组中的众数永远存在。
 */
public class Practice169 {

    //超过时间限制
    public int majorityElement(int[] nums) {
        if(nums == null){
            return 0;
        }
        int ret = 0;
        int len = nums.length;
        int n = len/2;

        for(int i = 0; i < nums.length; i++){
            int cnt = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                    if(cnt > n){
                        return nums[j];
                    }
                }
            }
        }

        return ret;
    }

    public int majorityElement2(int[] num) {
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,1,3};
        Practice169 p169 = new Practice169();
        System.out.println(p169.majorityElement2(nums));
    }
}
