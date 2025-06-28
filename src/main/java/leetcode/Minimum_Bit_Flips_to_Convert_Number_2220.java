package leetcode;

// 2220. Minimum Bit Flips to Convert Number
// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
public class Minimum_Bit_Flips_to_Convert_Number_2220 {
    public static int minBitFlips(int start, int goal) {
        int x = start ^ goal;
        int cnt = 0;
        while(x > 0) {
            cnt += x&1;
            x = x >> 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        System.out.println(minBitFlips(start, goal));
    }
}
