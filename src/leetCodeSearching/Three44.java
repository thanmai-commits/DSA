package leetCodeSearching;

import java.util.Arrays;

public class Three44 {
    public static void reverseString(char[] s){
        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char [] array = {'h', 'e', 'l', 'l', 'o'};
        reverseString(array);
        System.out.println(Arrays.toString(array));

    }
}
