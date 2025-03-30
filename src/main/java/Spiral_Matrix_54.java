import java.util.ArrayList;
import java.util.List;


/**
 * 54. Spiral Matrix
 *
 * https://leetcode.com/problems/spiral-matrix/description/
 */
public class Spiral_Matrix_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0;
        int bottom = m -1, right = n - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for  (int i = bottom; i >= top;  i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1,  2,  3,  4},
//                {12, 13, 14, 5},
//                {11, 16, 15, 6},
//                {10, 9,  8,  7}
//        };

        int[][] matrix = {
                {7},
                {9},
                {6}
        };
        Spiral_Matrix_54 obj = new Spiral_Matrix_54();
        List<Integer> ans = obj.spiralOrder(matrix);
        ans.stream().forEach(System.out::print);

    }
}
