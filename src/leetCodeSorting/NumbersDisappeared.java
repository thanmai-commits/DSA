package leetCodeSorting;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if(correctIndex < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans.add(j + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }
}
