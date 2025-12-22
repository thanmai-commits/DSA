package patterns;

public class StarPatterns {
    public static void main(String[] args) {
//        patternStar(5);
//        patternStar2(5);
        pattern4(5);

    }
    public static void pattern4(int n){
        for (int row = 1; row < 2 * n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for(int row = 1; row <= n - 1; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    public static void patternStar(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void patternStar2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= 1; col--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void patternStar3(int n){
        for (int row = 1; row <= n; row++) {
            for(int col = 0; col <= n - row; col++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
