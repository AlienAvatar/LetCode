package letcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 给定一个非负整数 num。 对于范围 0 ≤ i ≤ num 中的每个数字 i ，计算其二进制数中的1的数目并将它们作为数组返回。

 示例：
 比如给定 num = 5 ，应该返回 [0,1,1,2,1,2].


 */
public class Practice338 {
    public int[] countBits(int num) {
        int[] arr = new int[num+1];
        List<Integer> list = new ArrayList<>();
        if(num == 0){
            arr[num] = 0;
        }
        int k = 0;
        for(int i = 0; i <= num; i++){
            k = i;
            int count = 0;
            while(k != 0){
                if(k%2 == 1){
                    count++;
                }
                k = k/2;
            }

            list.add(count);
        }
        int j = 0;
        for(Integer c : list) {
            arr[j++] = c;
        }
        return arr;
    }

    public int[] countBits2(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }

    public int[] countBits3(int num) {
        int[] f = new int[num+1];
        int i;
        f[0] = 0;
        for (i=1; i<=num; ++i) {
            f[i] = f[i&(i-1)] + 1;
        }

        return f;
    }

    public static void main(String[] args) {
        Practice338 practice338 = new Practice338();
        practice338.countBits(2);
    }
}
