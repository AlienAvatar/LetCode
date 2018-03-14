package letcode;

public class Practice4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lo = 0;
        int hi = nums1.length -1;
        int mid = lo + (hi - lo)/2;
        int[] arr = merge(nums1,nums2,lo,mid,hi);
        return 0d;
    }

    public static int[] merge(int[] nums1,int[] nums2,int lo,int mid,int hi){
        int i = lo;
        int j = mid + 1;
        for(int k = lo; k <= hi; k++){
            if(i>mid){
                nums1[k] = nums2[j++];
            }else if(j > hi){
                nums1[k] = nums2[i++];
            }else if(nums2[j] < nums1[i]){
                nums1[k] = nums2[j++];
            }else{
                nums1[k] = nums2[i++];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int nums1[] = {1,3};
        int nums2[] = {2,4};
        findMedianSortedArrays(nums1,nums2);
    }
}
