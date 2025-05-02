package leetcode.binarySearch;

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class Count_Negative_Numbers_in_a_Sorted_Matrix_351 {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for(int[] row: grid){
        cnt += (row.length - getNegativeIndex(row));
        }
        return cnt;
    }

    int getNegativeIndex(int[] arr){
        int start = 0, end = arr.length-1,mid;

        while(start<=end){
            mid = start + (end - start)/2;

            if (arr[mid] >= 0) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }

    public static void main(String[] args) {
//        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] grid = {{3,2},{1,0}};
        Count_Negative_Numbers_in_a_Sorted_Matrix_351 obj = new Count_Negative_Numbers_in_a_Sorted_Matrix_351();
        System.out.println(obj.countNegatives(grid));

    }
}
