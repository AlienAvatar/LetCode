package letcode;

import java.util.*;

/**
 * 基本思想是，为了排列n个数字，我们可以在每个可能的位置将第n个数字添加到从n-1个数字产生的List <List <Integer >>中。

 例如，如果输入num []是{1,2,3}：首先，将1添加到初始List <List <Integer >>中（我们称之为“answer”）。

 然后，可以在前面或后面添加2.因此，我们必须在答案中复制列表（仅为{1}），在{1}的位置0上添加2，然后再次复制原始{1}，然后添加 2的位置1.现在我们有{{2,1}，{1,2}}的答案。 在当前答案中有2个列表。

 然后我们必须添加3.首先复制{2,1}和{1,2}，在位置0添加3; 然后复制{2,1}和{1,2}，并将3添加到位置1，然后对位置3做同样的事情。最后我们在答案中有2 * 3 = 6个列表，这就是我们想要的。
 */
public class Practice46 {
//    public static List<List<Integer>> permute(int[] nums) {
//        Map<Integer,List<Integer[]>> map = new HashMap<>();
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> list = null;
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j< i; j++){
//                int t = nums[i];
//                nums[i] = nums [j];
//                nums[j] = t;
////                if(!map.containsKey())
//                list = new ArrayList<>();
//                for(int k = 0; k < nums.length; k++){
//                    list.add(nums[k]);
//                }
//                lists.add(list);
//            }
//        }
//        return lists;
//    }

    public static List<List<Integer>> permute(int[] num) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (num.length ==0) return ans;
        List<Integer> l0 = new ArrayList<Integer>();
        l0.add(num[0]);
        ans.add(l0);
        for (int i = 1; i< num.length; ++i){
            List<List<Integer>> new_ans = new ArrayList<List<Integer>>();
            for (int j = 0; j<=i; ++j){
                for (List<Integer> l : ans){
                    List<Integer> new_l = new ArrayList<Integer>(l);
                    new_l.add(j,num[i]);
                    new_ans.add(new_l);
                }
            }
            ans = new_ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);
    }
}
