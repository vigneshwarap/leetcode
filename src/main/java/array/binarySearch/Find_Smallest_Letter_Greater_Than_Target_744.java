package array.binarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Find_Smallest_Letter_Greater_Than_Target_744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int mid;
        while(start<=end) {
            mid = start + (end-start)/2;
            if (letters[mid] > target) end = mid -1;
            else start = mid + 1;
        }
        // Both works
//        return letters[start % letters.length];
        return start < letters.length ? letters[start] : letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        Find_Smallest_Letter_Greater_Than_Target_744 obj = new Find_Smallest_Letter_Greater_Than_Target_744();
        System.out.println(obj.nextGreatestLetter(letters,target));
    }
}
