public class Reverse_String_344 {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);

    }

    public static void reverseString(char[] s) {
        if (s.length == 0) return;
        int i = 0, j = s.length-1;
        char tmp;
        while(i<j){
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
