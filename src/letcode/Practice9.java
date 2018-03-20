package letcode;

/**
 * 判断一个整数是否是回文数。不能使用辅助空间。

 点击查看提示

 一些提示:

 负整数可以是回文数吗？（例如 -1）

 如果你打算把整数转为字符串，请注意不允许使用辅助空间的限制。

 你也可以考虑将数字颠倒。但是如果你已经解决了 “颠倒整数” 问题的话，就会注意到颠倒整数时可能会发生溢出。你怎么来解决这个问题呢？

 @author Avatar


 */
public class Practice9 {
    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }
}
