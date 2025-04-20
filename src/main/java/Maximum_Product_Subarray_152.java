
// https://leetcode.com/problems/maximum-product-subarray/description/
// 152. Maximum Product Subarray
public class Maximum_Product_Subarray_152 {
    public int maxProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
        for (int i = 0 ; i < n; i++) {

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix = prefix * nums[i];
            suffix = suffix * nums[n-1-i];

            maxProd = Math.max(prefix, maxProd);
            maxProd = Math.max(suffix, maxProd);
        }
        return maxProd;
    }

    public static void main(String[] args) {
        Maximum_Product_Subarray_152 obj = new Maximum_Product_Subarray_152();
        int[] nums = {2,3,-2,4};
        System.out.println(obj.maxProduct(nums));
    }
}
