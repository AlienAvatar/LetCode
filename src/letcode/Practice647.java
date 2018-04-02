package letcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。

 具有不同起始索引或结束索引的子字符串即使是由相同的字符组成也会被计为不同的子字符串
 */
public class Practice647 {
//    Time Limit Exceeded
    public int countSubstrings(String s) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i <= s.length(); i++){
            for(int j = i+1;j <= s.length(); j++){
                String check = s.substring(i,j);
                StringBuffer sb = new StringBuffer(check);
                String palinStr = sb.reverse().toString();
                if(check.equals(palinStr)){
                    list.add(check);
                }
            }
        }
        return list.size();
    }


    int count =1;
    public int countSubstrings2(String s) {
        if(s.length()==0)
            return 0;
        for(int i=0; i<s.length()-1; i++){
            checkPalindrome(s,i,i);     //To check the palindrome of odd length palindromic sub-string
            checkPalindrome(s,i,i+1);   //To check the palindrome of even length palindromic sub-string
        }
        return count;
    }

    private void checkPalindrome(String s, int i, int j) {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){    //Check for the palindrome string
            count++;    //Increment the count if palindromin substring found
            i--;    //To trace string in left direction
            j++;    //To trace string in right direction
        }
    }
    public static void main(String[] args) {
        Practice647 practice647 = new Practice647();
        System.out.println(practice647.countSubstrings("aaa"));
        System.out.println(practice647.countSubstrings2("aaa"));
    }
}
