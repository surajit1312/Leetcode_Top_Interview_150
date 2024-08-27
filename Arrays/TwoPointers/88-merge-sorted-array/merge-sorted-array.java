class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0;
        int q = 0;
        int r = 0;
        int[] sorted = new int[m + n];
        while (p < m && q < n) {
            if (nums1[p] < nums2[q]) {
                sorted[r] = nums1[p];
                p++;
                r++;
            } else {
                sorted[r] = nums2[q];
                q++;
                r++;
            }
        }
        if (q >= n) {
            while (p < m) {
                sorted[r++] = nums1[p++];
            }
        }
        if (p >= m) {
            while (q < n) {
                sorted[r++] = nums2[q++];
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sorted[i];
        }
    }
}
