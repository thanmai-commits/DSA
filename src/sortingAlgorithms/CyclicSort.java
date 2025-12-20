package sortingAlgorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}
