package leetcode;
// 1482. Minimum Number of Days to Make m Bouquets
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

public class Minimum_Number_of_Days_to_Make_m_Bouquets_1482 {

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)bloomDay.length < (long)m * (long)k) return -1;
        int ans = Integer.MAX_VALUE;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        while (low <= high) {
            int mid = low + (high - low)/2;

            int bcnt = 0, acnt = 0;
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) {
                    acnt++;
                } else {
                    bcnt += acnt/k;
                    acnt = 0;
                }
            }
            bcnt += acnt/k;

            if (bcnt >= m) {
                ans = Math.min(ans, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }


        return ans;
    }


    public static void main(String[] args) {

        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;

        Minimum_Number_of_Days_to_Make_m_Bouquets_1482 obj = new Minimum_Number_of_Days_to_Make_m_Bouquets_1482();
        System.out.println(obj.minDays(bloomDay, m, k));
    }
}
