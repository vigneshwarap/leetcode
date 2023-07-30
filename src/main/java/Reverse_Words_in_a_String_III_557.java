public class Reverse_Words_in_a_String_III_557 {
    public static String reverseWords(String s) {
        char[] a = s.toCharArray();
        for(int start = 0, end = 0; end < a.length;end++) {
            while(end<a.length && a[end] != ' '){
                end++;
            }
            reverse(a,start,end-1);
            start = end+1;
        }
        return String.valueOf(a);
    }

    public static void reverse(char[] array, int start,int end) {
        while(start < end){
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        s = reverseWords(s);
        System.out.println(s);
    }
}
