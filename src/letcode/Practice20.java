package letcode;

import java.util.Stack;

public class Practice20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }


    public static boolean isValid2(String s) {
        Stack<Integer> p = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            int q = "(){}[]".indexOf(s.substring(i, i + 1));
            if(q % 2 == 1) {
                if(p.isEmpty() || p.pop() != q - 1) {
                    return false;
                }
            } else p.push(q);
        }
        return p.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
