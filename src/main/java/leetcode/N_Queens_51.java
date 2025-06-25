package leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 51. N-Queens
// https://leetcode.com/problems/n-queens/description/
public class N_Queens_51 {

    public static List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        dfs(0, board, ans);
        return ans;
    }

    public static void dfs(int col, char[][] board, List<List<String>> ans) {
        if (board.length == col) {
            ans.add(construct(board));
            return ;
        }
        for (int row = 0; row < board.length; row++) {
            if (validate(row, col, board)) {
                board[row][col] = 'Q';
                dfs(col+1, board, ans);
                board[row][col] = '.';
            }
        }

    }

    public static boolean validate(int row, int col, char[][] board) {
        // Check left upper diagonal
        int dubRow = row;
        int dubCol = col;

        while (dubRow >= 0 && dubCol >= 0) {
            if (board[dubRow][dubCol] == 'Q') return false;
            dubRow--;
            dubCol--;
        }

        // check left bottom diagonal
        dubRow = row;
        dubCol = col;

        while (dubRow < board.length && dubCol >= 0) {
            if (board[dubRow][dubCol] == 'Q') return false;
            dubRow++;
            dubCol--;
        }

        // Left horizontal line
        dubRow = row;
        dubCol = col;

        while (dubCol >=0) {
            if (board[dubRow][dubCol] == 'Q') return false;
            dubCol--;
        }

        return true;
    }

    public static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 4;
        List < List < String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }
}
