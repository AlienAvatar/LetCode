package letcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个数字字符串，返回数字所有可能表示的字母组合。

 下面给出数字到字母的映射（和电话号码一样）。

 输入：数字字符串 "23"
 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class Practice17 {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            //ans.peek().length 获取list中第一个元素的长度
            while(ans.peek().length()==i){

                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LinkedList<String> ans = new LinkedList<String>();
        ans.add("acs");
        ans.add("acssds");
        String s = " sd";

        System.out.println(ans.peek().length());
        letterCombinations("32");
    }
}
