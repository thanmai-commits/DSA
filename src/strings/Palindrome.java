package strings;

public class Palindrome {
    public static boolean palindromeString(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String  a = "abcdcba";
        String b = "Thanmai";
        boolean ans = palindromeString(a);
        boolean ans2 = palindromeString(b);
        System.out.println(ans);
        System.out.println(ans2);
//        int end = a.length() - 1;
//        System.out.println(end);
//        System.out.println(a.charAt(0) ==  a.charAt(end));
    }
}
