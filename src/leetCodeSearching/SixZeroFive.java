package leetCodeSearching;

public class SixZeroFive {
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1,0,1};
        boolean ans = canPlaceFlowers(arr,1);
        System.out.println(ans);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 1;
        while(n > 0 && i < flowerbed.length -1){
            if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                if(flowerbed[i] == 1){
                    i++;
                }
                else{
                    n--;
                    i++;
                }
            }
            else{
                i++;
            }
        }
        if(n == 0){
            return true;
        }
        return false;
//        for(int i = 1; i < flowerbed.length - 1; i++){
//            if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
//                flowerbed[i] = 1;
//                n--;
//            }
//            if(n == 0){
//                return true;
//            }
//            break;
//        }
//        return false;
    }
}
