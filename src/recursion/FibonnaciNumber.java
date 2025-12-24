package recursion;

public class FibonnaciNumber {
    public static void main(String[] args) {
        int fiboNumber = fibo(4);
        System.out.println(fiboNumber);
    }
    public static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
