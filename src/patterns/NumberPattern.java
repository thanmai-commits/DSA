package patterns;

public class NumberPattern {
    public static void main(String[] args) {
        pattern1(5);
    }
    public static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
