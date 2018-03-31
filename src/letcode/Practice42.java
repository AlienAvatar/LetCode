package letcode;

public class Practice42 {
    public int trap(int[] height) {
        int i = 0, j = height.length - 1, result = 0, plank = 0;
        while(i <= j){
            plank = plank < Math.min(height[i], height[j]) ? Math.min(height[i], height[j]) : plank;
            result = height[i] >= height[j] ? result + (plank - height[j--]) : result + (plank - height[i++]);
        }
        return result;
    }

    public static void main(String[] args) {
        Practice42 p = new Practice42();
//        p.trap()
    }
}
