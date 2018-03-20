package letcode;

/**
编写一个函数来查找字符串数组中最长的公共前缀字符串。
 */

public class Practice14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            //=0，证明前缀相同，indexOf找不到= -1,逐级截取字符串
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] strs = {"acc","abb","b"};
        int t = "ab".indexOf("b");
        longestCommonPrefix(strs);
    }
}
