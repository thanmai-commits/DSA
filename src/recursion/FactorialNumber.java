package recursion;

public class FactorialNumber {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n -1);
    }

    public static void main(String[] args) {
        int fibonnaciNumber =  factorial(3);
        System.out.println(fibonnaciNumber);
    }
}
