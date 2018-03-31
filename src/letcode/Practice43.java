package letcode;

/**
 *
 给定两个以字符串表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积。

 注意：

 num1 和 num2 的长度均小于110。
 num1 和 num2 均只包含数字 0-9。
 num1 和 num2 均不以零开头。
 你不能使用任何内置的大整数库或直接将输入转换为整数。
 */
public class Practice43 {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        Practice43 p = new Practice43();
        p.multiply("1","2");
    }
}
