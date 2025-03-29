
// 48. Rotate Image
// https://leetcode.com/problems/rotate-image/description/

public class Rotate_Image_48 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the array(Like a mirror in diagonal elements)
        for (int  i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        //Reverse the rows
        for (int i = 0; i < n; i++) {
            int left = 0 , right = n - 1;
            int[] nums = matrix[i];
            while (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }
    }



    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Rotate_Image_48 obj = new Rotate_Image_48();
        obj.rotate(matrix);
        for (int[] nums : matrix) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
