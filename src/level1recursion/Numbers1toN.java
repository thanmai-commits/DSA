package level1recursion;

public class Numbers1toN {
    public static void printOneToN(int n) {
        // Base case: Stop when n is 0
        if (n <= 0) {
            return;
        }

        // Recursive call with a smaller number (n-1)
        // This will keep calling until it reaches 1
        printOneToN(n - 1);

        // Print after the recursive call to ensure ascending order
        System.out.println(n);
    }

    public static void main(String[] args) {
        printOneToN(5);
    }
}
