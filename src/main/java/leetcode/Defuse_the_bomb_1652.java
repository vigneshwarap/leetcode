package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/defuse-the-bomb/description/
public class Defuse_the_bomb_1652 {
    public static void main(String[] args) {
        Defuse_the_bomb_1652 obj = new Defuse_the_bomb_1652();
/*        int[] code = {5,7,1,4};
        int k = 3;*/
        int[] code = {2,4,9,3};
        int k = -2;
        System.out.println(Arrays.toString(obj.decrypt(code, k)));
    }

    public int[] decrypt(int[] code, int k) {
        int ans[] = new int[code.length];
        if( k == 0) return ans;

        int n = code.length;
        int sum = 0;
        int start = k > 0 ? 1 : n+k;
        int end  = k > 0 ? k : n-1;

        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        for (int i = 0; i<n; i++) {
            ans[i] = sum;
            sum -= code[start++%n];
            sum += code[++end%n];
        }

        return ans;
    }
}
