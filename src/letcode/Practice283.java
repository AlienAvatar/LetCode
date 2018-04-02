package letcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice283 {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                list.add(nums[i]);
            }else{
                count++;
            }
        }
        int j = 0;
        while(j < count){
            list.add(0);
            j++;
        }
//        int[] arr = new int[list.size()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int a[] = {0, 1, 0, 3, 12};
        Practice283 practice283 = new Practice283();
        practice283.moveZeroes(a);
        for(int i : a){
            System.out.println(i);
        }
    }
}
