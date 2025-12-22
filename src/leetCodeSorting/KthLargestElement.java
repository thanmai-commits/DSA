package leetCodeSorting;

import java.util.Arrays;

public class KthLargestElement {
    public static int getMax(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void selection(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    public static int findKthLargest(int[] nums, int k){
        for(int i = 0; i < k; i++){
            int lastIndex = nums.length - i - 1;
            int maxIndex = getMax(nums,0, lastIndex);
            swap(nums, maxIndex, lastIndex);
        }
        return nums[nums.length - k];

    }

    public static void main(String[] args) {
//        int [] arr = {3,2,1,5,6,4};
        int [] arr2 = {3,2,3,1,2,4,5,5,6};
//        selection(arr2);
//        System.out.println(Arrays.toString(arr2));

        int ans = findKthLargest(arr2, 4);
        System.out.println(ans);
//        int max =  getMax(arr,0,arr.length-1);
//        System.out.println(arr[max]);
    }
}
