package letcode;

import java.util.ArrayList;
import java.util.List;

public class Practice22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max){
        //如果str=""，n=0;
        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }

    public static void main(String[] args) {
        Practice22 practice22 = new Practice22();
        List<String> list = practice22.generateParenthesis(3);
        for(String bean : list){
            System.out.println(bean);
        }
    }
}
