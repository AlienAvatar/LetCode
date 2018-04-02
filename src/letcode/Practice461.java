package letcode;

public class Practice461 {
    public int hammingDistance(int x, int y) {
        if(x < 0 || x > 2147483647){
            return 0;
        }
        int z = x^y;
        int count = 0;
        while(z != 0){
            if(z % 2 == 1) {
                count++;
            }
            z=z/2;
        }
        return count;
    }

    public static void main(String[] args) {
        Practice461 practice461 = new Practice461();
        practice461.hammingDistance(1,4);
    }
}
