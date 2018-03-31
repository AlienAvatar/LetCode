package letcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定候选号码数组 (C) 和目标总和数 (T)，找出 C 中候选号码总和为 T 的所有唯一组合。

 C 中的每个数字只能在组合中使用一次。

 注意:

 所有数字（包括目标）都是正整数。
 解决方案集不能包含重复的组合。


 例如，给定候选集合 [10, 1, 2, 7, 6, 1, 5] 和目标总和数 8，
 可行的集合是：

 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]
 */
public class Practice40 {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        Arrays.sort(cand);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        dfs_com(cand, 0, target, path, res);
        return res;
    }
    void dfs_com(int[] cand, int cur, int target, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList(path));
            return ;
        }
        if (target < 0) return;
        for (int i = cur; i < cand.length; i++){
            if (i > cur && cand[i] == cand[i-1]) continue;
            path.add(path.size(), cand[i]);
            dfs_com(cand, i+1, target - cand[i], path, res);
            path.remove(path.size()-1);
        }
    }
}
