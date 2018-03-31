package letcode;

public class Practice11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){ //当左边小于右边时，移动坐标轴
            maxArea = Math.max(maxArea,Math.min(height[left],height[right]) * (right - left));//计算面积 面积=最小的高度 * 两个相差的坐标轴长度
            if(height[left] < height[right]){
                left++; //当左边的高度小于右边时，移动左边
            }else{
                right--;//反之移动右边
            }
        }
        return maxArea;
    }
}
