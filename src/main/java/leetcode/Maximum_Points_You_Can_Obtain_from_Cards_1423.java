package leetcode;

public class Maximum_Points_You_Can_Obtain_from_Cards_1423 {

    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0, maxsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        maxsum = lsum;

        int rightIndex = cardPoints.length-1;
        for (int leftIndex = k - 1; leftIndex >= 0 ; leftIndex--, rightIndex--) {
            lsum -= cardPoints[leftIndex];
            rsum += cardPoints[rightIndex];

            maxsum = Math.max(maxsum, lsum + rsum);
        }
        return maxsum;
    }


    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        Maximum_Points_You_Can_Obtain_from_Cards_1423 obj = new Maximum_Points_You_Can_Obtain_from_Cards_1423();
        System.out.println(obj.maxScore(cardPoints, k));
    }
}
