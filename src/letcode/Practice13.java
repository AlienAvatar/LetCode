package letcode;

/**
 * 给定一个罗马数字，将其转换成整数。

 返回的结果要求在 1 到 3999 的范围内。
 */
public class Practice13 {
    public static int romanToInt(String s) {
        int sum=0;
        if(s.indexOf("IV")!=-1){sum-=2;}
        if(s.indexOf("IX")!=-1){sum-=2;}
        if(s.indexOf("XL")!=-1){sum-=20;}
        if(s.indexOf("XC")!=-1){sum-=20;}
        if(s.indexOf("CD")!=-1){sum-=200;}
        if(s.indexOf("CM")!=-1){sum-=200;}

        char c[]=s.toCharArray();
        int count=0;

        for(;count<=s.length()-1;count++){
            if(c[count]=='M') sum+=1000;
            if(c[count]=='D') sum+=500;
            if(c[count]=='C') sum+=100;
            if(c[count]=='L') sum+=50;
            if(c[count]=='X') sum+=10;
            if(c[count]=='V') sum+=5;
            if(c[count]=='I') sum+=1;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
