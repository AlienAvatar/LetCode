package letcode;

/**
 * 实现 pow(x, n)。
 */
public class Practice50 {
    public static double myPow(double x, int n) {
        double sum = x;
        if(n > 0) {
            for (int i = 1; i < n; i++) {
                sum = sum * x;
            }
        }else if(n == 0){
            return 1.0d;
        }else{
            for (int i = n; i < 0; i++) {
                sum = sum * x;
            }
            sum = 1/ sum;
        }
        return sum;
    }
    //success 根据myPow3更改
    public static double myPow2(double x, int n) {
        if(n==0) return 1;
        if(Math.abs(x-0.0)<0.0000001){
            return 0.0d;
        }
        if(Math.abs(x-1.0)<0.0000001){
            return 1.0d;
        }
        if(n<0){
            x = 1.0/x;
        }

        return Power2(x, Math.abs(n));
    }

    static double Power2(double x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;

        return (n % 2 == 0) ? Power2(x*x, n/2) : x * Power2(x*x, n/2);
    }

    //success
    public static double myPow3(double x, int n) {
        if(n == 0) return 1;
        if(Math.abs(x-0.0)<0.0000001) return 0.0;
        if(Math.abs(x-1.0)<0.0000001) return 1.0;

        if(n < 0) x = 1.0/x;
        return Power3(x, Math.abs(n));
    }

     static double Power3(double x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;

        return ((n & 0x1) == 1) ? x*Power3(x*x, n/2) : Power3(x*x, n/2);
    }

    public static void main(String[] args) {
        System.out.println(myPow3(34.0,-3));
    }
}
