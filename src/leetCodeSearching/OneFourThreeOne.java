package leetCodeSearching;
import java.util.*;

public class OneFourThreeOne {
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,3};
        List<Boolean> ans = kidsWithCandies(arr, 3);
        System.out.println(ans);
    }
    public static int max(int[]arr){
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans =   new ArrayList<>();
        int maxValue = max(candies);
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= candies[maxValue]){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}
