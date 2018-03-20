package letcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 长度最长为1000。
 */
public class Practice5 {
    //超出时间限制
    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String str = "";
        List<String> list = new ArrayList<String>();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                str = s.substring(i, j);
                StringBuffer sb = new StringBuffer(str);
                String che = sb.reverse().toString();
                if (str.equals(che) && str.length() > 0) {
                    list.add(str);
                }
            }
        }
        int max = 0;
        String re = null;
        for (String bean : list) {
            int len = bean.length();
            if (len > max) {
                max = len;
                re = bean;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome( "cbbd"));
    }
}
