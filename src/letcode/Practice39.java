package letcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给一组候选数字（C）（没有重复）并给一个目标数字（T），找出 C 中所有唯一的组合使得它们的和为 T。

 可以从 C 无限次数中选择相同的数字。

 说明：

 所有数字（包括目标）都是正整数。
 解集合中没有相同组合。


 例如，给一个候选集合 [2, 3, 6, 7] 并且目标为 7，
 一个解的集合为：

 [
 [7],
 [2, 2, 3]
 ]

 基本思想是：target - 数组的元素，索引i，先假设所有元素都是第一个元素，若无法=0，则更换一个元素，以此往复
 1： 2,2,2
 2： 2,2,3

 假设目标是11
 1:2,2,2,2,2
 2:2,2,2,2,3
// 3:2,2,6
// 4:2,2,7 OK
 */
public class Practice39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);

        return result;
    }

    private static void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size() - 1);
            }//for
        }//if
        else if(target == 0 ){
            result.add(new ArrayList<Integer>(cur));
        }//else if
    }

    public static void main(String[] args) {
        int nums[] = {2,3,6,7};
        combinationSum(nums,11);
    }
}
