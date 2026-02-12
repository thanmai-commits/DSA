package sortingAlgorithms;


import java.util.Arrays;

public class SelectionSort {
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

    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
