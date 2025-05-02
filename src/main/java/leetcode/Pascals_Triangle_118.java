package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 */
public class Pascals_Triangle_118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i<= numRows; i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }

    public List<Integer> generateRow(int rowNumber) {
        List<Integer> ansList = new ArrayList<>();
        ansList.add(1);
        int ans = 1;
        for (int i = 1; i < rowNumber; i++) {
            ans =  ans * (rowNumber - i) ;
            ans = ans / i;
            ansList.add(ans);
        }
        return ansList;
    }

    public static void main(String[] args) {
        Pascals_Triangle_118 obj = new Pascals_Triangle_118();
        List<List<Integer>> ans = obj.generate(5);
        for (List<Integer> list : ans) {
            for (Integer val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
