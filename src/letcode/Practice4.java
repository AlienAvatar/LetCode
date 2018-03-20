package letcode;


public class Practice4 {
    public static double findMedianSortedArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        // the following call is to make sure len(A) <= len(B).
        // yes, it calls itself, but at most once, shouldn't be
        // consider a recursive solution
        if (n > m)
            return findMedianSortedArrays(B, A);

        // now, do binary search
        int k = (n + m - 1) / 2;
        int l = 0, r = Math.min(k, n); // r is n, NOT n-1, this is important!!
        while (l < r) {
            int midA = (l + r) / 2;
            int midB = k - midA;
            if (A[midA] < B[midB])
                l = midA + 1;
            else
                r = midA;
        }

        // after binary search, we almost get the median because it must be between
        // these 4 numbers: A[l-1], A[l], B[k-l], and B[k-l+1]

        // if (n+m) is odd, the median is the larger one between A[l-1] and B[k-l].
        // and there are some corner cases we need to take care of.
        int a = Math.max(l > 0 ? A[l - 1] : Integer.MIN_VALUE, k - l >= 0 ? B[k - l] : Integer.MIN_VALUE);
        if (((n + m) & 1) == 1)
            return (double) a;

        // if (n+m) is even, the median can be calculated by
        //      median = (max(A[l-1], B[k-l]) + min(A[l], B[k-l+1]) / 2.0
        // also, there are some corner cases to take care of.
        int b = Math.min(l < n ? A[l] : Integer.MAX_VALUE, k - l + 1 < m ? B[k - l + 1] : Integer.MAX_VALUE);
        return (a + b) / 2.0;
    }

    public static int[] merge(int[] nums1,int[] nums2){
        int aux[] = new int[nums1.length + nums2.length];
        for (int k = 0; k <= aux.length; k++) {
            for (int i = 0; i <= nums1.length; i++) {
                for (int j = 0; j <= nums2.length; j++) {
                    if (nums1[i] > nums2[j]) {
                        aux[k] = nums2[j];
                    } else if (nums1[i] < nums2[j]) {
                        aux[k] = nums1[i];
                    } else {
                        aux[k] = nums1[i];
                    }
                }
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        int nums1[] = {1,3};
        int nums2[] = {2,4};
//        merge(nums1,nums2);
        findMedianSortedArrays(nums1,nums2);
    }
}
