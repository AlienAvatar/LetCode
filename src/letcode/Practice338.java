package letcode;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        Practice338 practice338 = new Practice338();
        practice338.countBits(2);
    }
}
