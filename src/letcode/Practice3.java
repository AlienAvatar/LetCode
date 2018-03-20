package letcode;

import java.util.HashMap;

/**
 *
 给定一个字符串，找出不含有重复字符的 最长子串 的长度。

 示例：

 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。

 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。

 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列 而不是子串。

 基本思想是，保留一个散列表，它将字符串中的字符存储为键，并将它们的位置存储为值，并保留定义最大子字符串的两个指针。
 移动右边的指针扫描字符串，同时更新散列表。
 如果该字符已经在散列表中，则将左指针移到最后找到的同一个字符的右侧。
 请注意，这两个指针只能向前移动。
 */
public class Practice3 {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

    public static void main(String[] args) {
        int count = lengthOfLongestSubstring("adbccba");
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(count);
    }
}
