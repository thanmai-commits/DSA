package leetCodeSorting;

import java.util.Arrays;

public class Eleven {
    public static void main(String[] args) {
        int [] arr = {1,1};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
        int ans = maxArea(arr);
        System.out.println(ans);
    }

    public static int getMax(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void selection(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    public static int maxArea(int[] height) {
        selection(height);
        int anchor = height.length - 1;
        for(int secondMax = height.length - 2; secondMax >= 0; secondMax--){
            if(secondMax == 0 || height[secondMax] != height[anchor]){
                return height[secondMax] * height[secondMax];
            }
            else{
                anchor--;
            }
        }
        return -1;

    }
}
