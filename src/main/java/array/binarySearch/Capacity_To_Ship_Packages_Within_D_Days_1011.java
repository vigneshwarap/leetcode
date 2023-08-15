package array.binarySearch;

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class Capacity_To_Ship_Packages_Within_D_Days_1011 {

    public int shipWithinDays(int[] weights, int days) {
        int start = 0, end = 0, mid;
        for(int weight: weights) {
            start = Math.max(start, weight);
            end += weight;
        }

        while(start<=end){
            mid = start + (end - start)/2;
            int tempdays = daysRequired(weights, mid);
            if (tempdays <= days) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    int daysRequired(int[] weights, int capacity)
    {
        int tmp=0,daysCount=0;
        for(int weight: weights){
            if(tmp+weight > capacity) {
                daysCount++;
                tmp = weight;
            } else {
                tmp += weight;
            }
        }
        return ++daysCount;
    }

    public static void main(String[] args) {
        Capacity_To_Ship_Packages_Within_D_Days_1011 obj = new Capacity_To_Ship_Packages_Within_D_Days_1011();
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(obj.shipWithinDays(weights,days));
    }
}
