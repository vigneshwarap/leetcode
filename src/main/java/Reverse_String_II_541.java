public class Reverse_String_II_541 {

    public static String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        int start = 0;
        while(start < s.length()) {
            reverse(a,start,Math.min(start+k-1, a.length-1));
            start += 2*k;
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
        String s = "abcd";
        s = reverseStr(s,4);
        System.out.println(s);
    }
}
