package letcode;

/**
 * 假设你有一个数组，其中第 i 个元素是一支给定股票第 i 天的价格。

 如果您只能完成最多一笔交易（即买入和卖出一股股票），则设计一个算法来找到最大的利润。

 示例 1:

 输入: [7, 1, 5, 3, 6, 4]
 输出: 5

 最大利润 = 6-1 = 5（不是 7-1 = 6, 因为卖出价格需要大于买入价格）
 */

public class Practice121 {
    public static int maxProfit(int[] prices){
        if(prices == null){
            return 0;
        }
        int maxCur = 0;
        int maxSoFar = 0;
        for(int i = 1; i < prices.length; i++){
            maxCur = Math.max(0,maxCur = maxCur + (prices[i] - prices[i-1]));
            maxSoFar = Math.max(maxCur,maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {0,6,-3,7};
        int re = maxProfit(nums);
        System.out.println(re);
    }
}
