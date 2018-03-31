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

    public String longestPalindrome2(String s) {
        String res = "";
        int currLength = 0;
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s,i-currLength-1,i)){
                res = s.substring(i-currLength-1,i+1);
                currLength = currLength+2;
            }
            else if(isPalindrome(s,i-currLength,i)){
                res = s.substring(i-currLength,i+1);
                currLength = currLength+1;
            }
        }
        return res;
    }

    public boolean isPalindrome(String s, int begin, int end){
        if(begin<0) return false;
        while(begin<end){
            if(s.charAt(begin++)!=s.charAt(end--)) return false;
        }
        return true;
    }

    public String longestPalindrome3(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        Practice5 practice5 = new Practice5();
        System.out.println(longestPalindrome(practice5.longestPalindrome2("aaba")));
        System.out.println(longestPalindrome(practice5.longestPalindrome3("aaba")));
        System.out.println(longestPalindrome( "cbbd"));
    }
}
