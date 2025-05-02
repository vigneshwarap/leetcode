package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// https://leetcode.com/problems/merge-intervals/description/
// 56. Merge Intervals
public class Merge_Intervals_56 {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ansList = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        for (int i = 0 ; i < intervals.length; i++) {
            if (ansList.isEmpty() || intervals[i][0] > ansList.get(ansList.size() - 1).get(1)) {
                ansList.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                ansList.get(ansList.size() - 1).set(1, Math.max(ansList.get(ansList.size() - 1).get(1), intervals[i][1]) );
            }
        }

        int[][] ans = new int[ansList.size()][2];
        for (int i = 0 ; i < ansList.size(); i++) {
            for (int j = 0; j < 2; j++) {
                ans[i][j] = ansList.get(i).get(j);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Merge_Intervals_56 obj = new Merge_Intervals_56();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = obj.merge(intervals);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
